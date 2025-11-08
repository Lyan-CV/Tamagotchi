package tama;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    private JLabel imagemLabel;

    public Interface() {
        // ======= CONFIG JANELA PRINCIPAL =======
        setTitle("Tamagotchi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 700);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 
        setResizable(false);

        // ======= FUNDO COM GRADIENTE =======
        JPanel background = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                // Gradiente do azul pro rosa
                GradientPaint gradiente = new GradientPaint(
                        0, 0, new Color(34, 133, 195),
                        getWidth(), getHeight(), new Color(232, 45, 253)
                );
                g2d.setPaint(gradiente);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        background.setOpaque(true);
        background.setLayout(new GridBagLayout()); // mantém o container central no meio

        // ======= CONTAINER CENTRAL =======
        JPanel container = new JPanel(new BorderLayout(10, 20));
        container.setPreferredSize(new Dimension(500, 500));
        container.setBackground(new Color(0xFFF5F5));
        container.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));

        // ======= TÍTULO E SUBTÍTULO =======
        JPanel topo = new JPanel(new GridLayout(2, 1));
        topo.setBackground(new Color(0xFFF5F5));

        JLabel titulo = new JLabel("Tamagotchi", SwingConstants.CENTER);
        titulo.setFont(new Font("DynaPuff", Font.BOLD, 36));
        titulo.setForeground(Color.BLACK);

        JLabel subtitulo = new JLabel("Escolha o seu animal", SwingConstants.CENTER);
        subtitulo.setFont(new Font("DynaPuff", Font.PLAIN, 20));
        subtitulo.setForeground(Color.DARK_GRAY);

        topo.add(titulo);
        topo.add(subtitulo);

        // ======= TELA PRETA =======
        JPanel tela = new JPanel(new GridBagLayout());
        tela.setPreferredSize(new Dimension(300, 300));
        tela.setBackground(Color.BLACK);
        tela.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

        imagemLabel = new JLabel();
        imagemLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tela.add(imagemLabel);

        // ======= BOTÕES =======
        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 15));
        botoes.setBackground(new Color(0xFFF5F5));

        String[] nomes = {"Cachorro", "Gato", "Panda", "Corvo"};
        for (String nome : nomes) {
            JButton btn = new JButton(nome);
            btn.setFocusPainted(false);
            btn.setFont(new Font("DynaPuff", Font.PLAIN, 14));
            btn.setBackground(new Color(0xCA88EB));
            btn.setForeground(Color.BLACK);
            btn.setBorder(BorderFactory.createLineBorder(new Color(0xCA88EB), 2, true));
            btn.setPreferredSize(new Dimension(90, 40));
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

            btn.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    btn.setBackground(new Color(0x9760B3));
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    btn.setBackground(new Color(0xCA88EB));
                }
            });

            botoes.add(btn);// adiciona os botões
        }

        // ======= MONTAGEM FINAL =======
        container.add(topo, BorderLayout.NORTH); // Coloca os elementos no topo
        container.add(tela, BorderLayout.CENTER); // Coloca os elementos no centro
        container.add(botoes, BorderLayout.SOUTH); // Coloca os elementos em baixo

        background.add(container);
        add(background, BorderLayout.CENTER); //  Adiciona o background no centro

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interface::new);
    }
}
