
import Tamagotchi.Animal;

public class Cachorro extends Animal {

    public String raca;
    public String cor;
    public String pelagem;

    public String EmetirSom() {
        return "AUauAu";
    }

    public void Passear() {
        this.felicidade += 20;

        System.out.println("Passeando pelo parque!");

    }

    public void passear() {
        System.out.println("Passeando pela rua!");
    }
}
