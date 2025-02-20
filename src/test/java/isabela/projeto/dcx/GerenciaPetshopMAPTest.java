package isabela.projeto.dcx;

import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciaPetshopMAPTest {

    @Test
    public void testaCadastroPesquisaEremocao() throws IOException, DonoNaoExisteException, animalJaCadastradoException {
        GerenciaPetshopMAP gererenciador = new GerenciaPetshopMAP();

        gererenciador.cadastraDadosAnimais("Belinha", EspecieAnimal.GATO, "Siamês", 7, "Isabela");

        List<Animais> animaisIsabela = gererenciador.pesquisaAnimalPorDono(new ArrayList<>(gererenciador.animaisMap.values()), "Isabela");

        boolean removido = gererenciador.removerDadosAnimais("Belinha");
    }


}