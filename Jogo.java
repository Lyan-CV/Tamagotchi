package Tamagotchi;

//import java.util.ArrayList;
//import java.util.List;


public class Jogo {
    public boolean ativo;
    public int tempoDeJogo;
 //   public List<Animal> animais = new ArrayList<>();
    public String animalAtual;

    private Thread contadorThread;

    public void iniciar() {
        ativo = true;
        tempoDeJogo = 0;
        System.out.println("Inicializando Tamagotchi...");

        contadorThread = new Thread(() -> {
            while (ativo) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tempoDeJogo++;
                System.out.println("Tempo de Jogo: " + tempoDeJogo);
            }
        });
        contadorThread.start();
    }

    public void desligar() {
        ativo = false;
        System.out.println("Jogo desligado. Tempo final: " + tempoDeJogo);
    }

    public static void main(String[] args) throws InterruptedException {
        Jogo jogo = new Jogo();

        jogo.iniciar(); 
        Thread.sleep(9000);

        jogo.desligar(); 
    }
}
