package isabela.projeto.dcx;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GravadorDadosPets{


    private String arquivoAnimais;

    public GravadorDadosPets() {
        this.arquivoAnimais = "animais.dat";
    }

    void salvarDadosAnimais(Map<String, Animais> animais) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoAnimais))){
            out.writeObject(animais);
        } catch (IOException e){
            throw new IOException(e);
        }
    }


    public Map<String, Animais> recuperaDadosAnimais() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivoAnimais))) {
            return (HashMap<String, Animais>) in.readObject();
        } catch (FileNotFoundException e){
            return new HashMap<>();
        } catch (IOException| ClassNotFoundException e){
            throw new IOException(e);
        }
    }
}