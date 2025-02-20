package isabela.projeto.dcx;

import java.io.IOException;
import java.util.List;

public interface GerenciaPetshop {
    void cadastraDadosAnimais (String nome, EspecieAnimal especie, String raca, int idade, String dono) throws animalJaCadastradoException, IOException;
    List<Animais> pesquisaAnimalPorDono (List<Animais> animais, String dono) throws DonoNaoExisteException;
    boolean removerDadosAnimais (String nome) throws IOException;
}