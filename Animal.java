package Tamagotchi;

public abstract class Animal {
	public int id;
	public String nome;
	public int energia;
	public int fome;
	public int sede;
	public int felicidade;
	public int saude;
	
	public Animal() {}

	public Animal(int id, String nome, int energia, int fome, int sede, int felicidade, int saude) {
		super();
		this.id = id;
		this.nome = nome;
		this.energia = energia;
		this.fome = fome;
		this.sede = sede;
		this.felicidade = felicidade;
		this.saude = saude;
	}
	
	public void Alimentar(int pId_Comida) {
		if(pId_Comida == 1) {
			this.fome +=1;
		}else if(pId_Comida ==2) {
			this.fome +=2;
		}
	}
	
	public void Dormir() {
		this.energia += 100;
	}
	
	public void Brincar() {
		this.felicidade +=10;
	} 
	public void IrVeterinario() {
		this.saude +=100;
	}
	
	public abstract String EmetirSom();
	
	public void MostrarStatus(){
		System.out.println("Nome: "+this.nome+ "\nEnergia: "+this.energia+"\nFome: "+this.fome+"\nSede: "+this.sede+"\nFelicidade: "+this.felicidade+"\nSaude: "+this.saude);
	}
}
