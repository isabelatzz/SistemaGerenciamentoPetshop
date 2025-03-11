package isabela.projeto.dcx;

import java.io.IOException;
import java.util.List;

public interface GerenciaPetshop {
    boolean cadastraDadosAnimais (String nome, EspecieAnimal especie, String raca, int idade, String dono) throws animalJaCadastradoException, IOException;
    List<Animais> pesquisaAnimalPorDono (List<Animais> animais, String dono) throws DonoNaoExisteException;

    /**
     * Remove dados dos animais mas tenho q tratar caso tenha dois pets do msm nome
     * @param nome
     * @return
     * @throws IOException
     */
    boolean removerDadosAnimais (String nome) throws IOException;

}