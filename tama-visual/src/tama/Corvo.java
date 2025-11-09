package tama;

public class Corvo extends Animal {
    private String raca;
    public String cor;
    public int inteligencia;

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String emitirSom() {
        return "Cuáááá";
    }

    public void sobrevoar() {
        System.out.println(nome + " está sobrevoando o local!");
    }
}
