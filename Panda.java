import Tamagotchi.Animal;

public class Panda extends Animal {
	public String raca;
	private String cor;
	public String pelagem;
	
	public String getCor() {
		return this.cor;
	}
	
	public String emitirSom() {
		return "Grrrr"; //barulho do panda comendo
	}
	
	public void subirArvore() {
		System.out.println("Subindo em árvores e pulando.");
		
	}

}