package isabela.projeto.dcx;

import java.io.Serializable;

public class Animais implements Serializable {
    private String nome;
    private EspecieAnimal especie;
    private String raca;
    private int idade;
    private String dono;


    public Animais (String nome, EspecieAnimal especie, String raca, int idade, String dono) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EspecieAnimal getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = EspecieAnimal.valueOf(especie);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", dono='" + dono + '\'' +
                '}';
    }


}