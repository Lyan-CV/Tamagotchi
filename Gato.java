import Tamagotchi.Animal;

public class Gato extends Animal{
    private String raca;
    public String cor;
    public String pelagem;

    public void setRaca(String pRaca){
        this.raca = pRaca;
    }
    public String getRaca(){
        return this.raca;
    }

    public String EmetirSom(){
        return "Miau";
    }

    public void Passear() {
        this.felicidade += 5;

        System.out.println("Passeando pelos tetos!");

    }

    public void pegarRato(){
        System.out.println("Pegando Rato");
    }

}
