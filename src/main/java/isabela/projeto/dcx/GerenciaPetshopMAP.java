package isabela.projeto.dcx;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciaPetshopMAP implements GerenciaPetshop {
    public Map<String, Animais> animaisMap;
    private GravadorDadosPets gravadorDadosPets;


    public GerenciaPetshopMAP(){
        this.animaisMap = new HashMap<>();
        this.gravadorDadosPets = new GravadorDadosPets();
    }


    @Override
    public boolean cadastraDadosAnimais(String nome, EspecieAnimal especie, String raca, int idade, String dono)
            throws animalJaCadastradoException, IOException {
        if (this.animaisMap.containsKey(nome)) {
            throw new animalJaCadastradoException("Seu pet já está cadastrado! :)");
        }
        Animais a = new Animais(nome, especie, raca, idade, dono);
        this.animaisMap.put(nome, a);

        try {
            gravadorDadosPets.salvarDadosAnimais(this.animaisMap);
        } catch (IOException e) {
            throw new IOException(e);
        }
        return true; // Retorne true para indicar que o cadastro foi bem-sucedido
    }

    @Override
    public List<Animais> pesquisaAnimalPorDono(List<Animais> animais, String dono) throws DonoNaoExisteException {
        List<Animais> animaisDoDono = new ArrayList<>();
        for (Animais a: animais) {
            if(a.getDono().equalsIgnoreCase(dono)){
                animaisDoDono.add(a);
            }
        }
        return animaisDoDono;
    }

    @Override
    public boolean removerDadosAnimais(String nome) throws IOException {
        if(this.animaisMap.containsKey(nome)){
            this.animaisMap.remove(nome);
            try {
                gravadorDadosPets.salvarDadosAnimais(this.animaisMap);
            } catch (IOException e) {
                throw new IOException(e);
            }
            return true;
        } else {
            return false;
        }
    }
}