package modulos;
import javax.swing.*;

public class PaginaInicial extends JFrame {
    private JTextField campoRA;
    private JComboBox<String> comboMaterias;

    public PaginaInicial() {
        setTitle("Menu Principal");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Campo de entrada para o RA
        JLabel labelRA = new JLabel("Digite seu RA:");
        labelRA.setBounds(100, 100, 150, 30);
        add(labelRA);

        campoRA = new JTextField();
        campoRA.setBounds(250, 100, 200, 30);
        add(campoRA);

        JLabel labelMateria = new JLabel("Selecione a matéria:");
        labelMateria.setBounds(100, 150, 150, 30);
        add(labelMateria);

        comboMaterias = new JComboBox<>(new String[]{"POO", "BD"}); 
        comboMaterias.setBounds(250, 150, 200, 30);
        add(comboMaterias);

        JButton botaoProsseguir = new JButton("Prosseguir");
        botaoProsseguir.setBounds(250, 200, 150, 40);
        botaoProsseguir.addActionListener(e -> validarRA());
        add(botaoProsseguir);
    }

 
    private void validarRA() {
        String ra = campoRA.getText();
        
        if (ra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo RA não pode estar vazio.");
        } else if (ra.length() != 6 || !ra.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O RA deve conter exatamente 6 números.");
        } else {
            
            String materiaSelecionada = (String) comboMaterias.getSelectedItem();
            new PaginaTextoApoio(materiaSelecionada).setVisible(true);
            dispose(); l
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PaginaInicial().setVisible(true));
    }
}
