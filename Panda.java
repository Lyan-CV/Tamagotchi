import Tamagotchi.Animal;

public class Panda extends Animal {
	public String raca;
	private String cor;
	public String pelagem;
	
	public String getCor() {
		return this.cor;
	}
	
	public String EmetirSom() {
		return "Grrrr"; //barulho do panda comendo
	}
	
	public void Passear() {
        this.felicidade += 1;

        System.out.println("Dormiu antes de sair de casa!");

    }

	public void subirArvore() {
		System.out.println("Subindo em árvores e pulando.");
		
	}

}