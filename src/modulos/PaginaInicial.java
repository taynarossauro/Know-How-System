package modulos;
import javax.swing.*;

public class PaginaInicial extends JFrame {
    private JTextField raTextField;

    public PaginaInicial() {
        setTitle("Página Inicial");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel raLabel = new JLabel("Insira seu RA:");
        raLabel.setBounds(30, 30, 100, 30);
        add(raLabel);

        raTextField = new JTextField();
        raTextField.setBounds(130, 30, 200, 30);
        add(raTextField);

        JLabel escolhaMateriaLabel = new JLabel("Qual conteúdo gostaria de aprender?", SwingConstants.CENTER);
        escolhaMateriaLabel.setBounds(30, 70, 300, 30);
        add(escolhaMateriaLabel);

        JButton botaoPOO = new JButton("POO");
        botaoPOO.setBounds(50, 130, 120, 30);
        botaoPOO.addActionListener(e -> validarRA("POO"));
        add(botaoPOO);

        JButton botaoBD = new JButton("BD (SQL)");
        botaoBD.setBounds(200, 130, 120, 30);
        botaoBD.addActionListener(e -> validarRA("BD (SQL)"));
        add(botaoBD);
    }

    private void validarRA(String materiaSelecionada) {
        String ra = raTextField.getText().trim();

        if (ra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira seu RA!!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (ra.length() != 6 || !ra.matches("\\d{6}")) {
            JOptionPane.showMessageDialog(this, "Insira um RA válido!!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            new PaginaIntroducao(materiaSelecionada).setVisible(true);
        }
    }
}
