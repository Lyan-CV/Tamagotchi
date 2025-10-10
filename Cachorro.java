import Tamagotchi.Animal;

public class Cachorro extends Animal{
    public String raca;
    public String cor;
    public String pelagem;

    public String EmetirSom(){
		return  "AUauAu";
    }

    public void  passear(){
        System.out.println("Passeando pela rua!");
    }
}
