package tama;

public class Cachorro extends Animal {
    public String raca;
    public String cor;
    public String pelagem;

    @Override
    public String emitirSom() {
        return "AuAuAu";
    }

    public void passear() {
        System.out.println(nome + " está passeando pela rua!");
    }
}
