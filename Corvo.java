import Tamagotchi.Animal;

public class Corvo extends Animal{
    private String raca;
    public String cor;
    public int inteligencia;


    public void setRaca(String pRaca){
        this.raca = pRaca;
    }

    public String getRaca(){
        return this.raca;
    }

    public void Passear() {
        this.felicidade += 15;

        System.out.println("Sobrevoando o bairro!");

    }

    public String EmetirSom() {
		return "Cuáááá"; //barulho do panda comendo
	}

    public void Sobrevoar(){
        System.out.println("Sobrevoando o local");
    }
}