public class Item {
    
    public int id;
    public String nome;
    public int pontos;
    public String tipo;

    public Item(int id, String nome, int pontos, String tipo){
        this.id = id;
        this.nome = nome;
        this.pontos = pontos;
        this.tipo = tipo;
    }
    
    public String getNome(){
        return nome;
    }

    public int getPontos(){
        return pontos;
    }

    public String getTipo(){
        return tipo;
    }
}
