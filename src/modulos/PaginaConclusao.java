package modulos;
import javax.swing.*;

public class PaginaConclusao extends JFrame {

    public PaginaConclusao() {
        setTitle("Conclusão");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Mensagem de conclusão
        JLabel mensagem = new JLabel("Parabéns, você concluiu o módulo!");
        mensagem.setHorizontalAlignment(SwingConstants.CENTER); 
        mensagem.setBounds(400, 150, 600, 50); 
        add(mensagem);

        // Botão para voltar ao menu
        JButton botaoVoltarMenu = new JButton("Voltar ao Menu");
        botaoVoltarMenu.setBounds(600, 300, 200, 40);
        botaoVoltarMenu.addActionListener(e -> {
            dispose();
            new PaginaInicial().setVisible(true);
        });
        add(botaoVoltarMenu);
    }
}

