package modulos;
import javax.swing.*;

public class PaginaIntroducao extends JFrame {
    public PaginaIntroducao(String materia) {
        setTitle("Introdução - " + materia);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel introducaoLabel = new JLabel("<html><center>Bem-vindo ao módulo 1 de " + materia + ".</center></html>");
        introducaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        introducaoLabel.setBounds(400, 200, 600, 200); 
        add(introducaoLabel);

        // Botão de início do módulo
        JButton botaoIniciar = new JButton("COMEÇAR");
        botaoIniciar.setBounds(600, 500, 200, 40); 
        botaoIniciar.addActionListener(e -> {
            dispose();
            new PaginaTextoApoio(materia).setVisible(true);
        });
        add(botaoIniciar);
    }
}
