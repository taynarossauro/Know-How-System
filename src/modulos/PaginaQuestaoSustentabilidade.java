package modulos;
import javax.swing.*;

public class PaginaQuestaoSustentabilidade extends JFrame {

    public PaginaQuestaoSustentabilidade() {
        setTitle("Questão de Sustentabilidade");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Texto da pergunta em um JTextArea
        JTextArea pergunta = new JTextArea("AGORA, PARA CONCLUIR O MÓDULO, VOCÊ DEVE ACERTAR UMA QUESTÃO A RESPEITO DE SUSTENTABILIDADE!!\nO que é reciclagem?");
        pergunta.setBounds(400, 100, 500, 60);
        pergunta.setLineWrap(true);
        pergunta.setWrapStyleWord(true);
        pergunta.setEditable(false); // Torna o JTextArea somente leitura
        pergunta.setOpaque(false); // Remove o fundo branco do JTextArea
        add(pergunta);

        // Opções de resposta
        JRadioButton opcao1 = new JRadioButton("Reutilizar materiais");
        opcao1.setBounds(400, 180, 300, 30);
        add(opcao1);

        JRadioButton opcao2 = new JRadioButton("Poluição de rios");
        opcao2.setBounds(400, 220, 300, 30);
        add(opcao2);

        JRadioButton opcao3 = new JRadioButton("Desmatamento de florestas");
        opcao3.setBounds(400, 260, 300, 30);
        add(opcao3);

        JRadioButton opcao4 = new JRadioButton("Separação de resíduos"); 
        opcao4.setBounds(400, 300, 300, 30);
        add(opcao4);

        // Agrupar opções
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(opcao1);
        grupo.add(opcao2);
        grupo.add(opcao3);
        grupo.add(opcao4);

        JButton botaoEnviar = new JButton("Enviar Resposta");
        botaoEnviar.setBounds(500, 380, 200, 40); 
        botaoEnviar.addActionListener(e -> {
            if (opcao1.isSelected()) {
                dispose();
                new PaginaConclusao().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Resposta incorreta. Tente novamente.");
            }
        });
        add(botaoEnviar);
    }
}
