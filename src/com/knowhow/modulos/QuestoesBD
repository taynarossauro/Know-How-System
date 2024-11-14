package modulos;
import javax.swing.*;

public class QuestoesBD extends JFrame {
    private int acertos = 0;

    public QuestoesBD() {
        setTitle("Questões de Banco de Dados");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Faz a janela ocupar a tela cheia
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Mantém o layout como null para controlar manualmente as posições

        // Questão 1
        JLabel pergunta1 = new JLabel("Questão 1: O que é uma chave primária?");
        pergunta1.setBounds(100, 100, 600, 30);
        add(pergunta1);

        // Alternativas para a questão 1
        JRadioButton opcao1_1 = new JRadioButton("Um campo que identifica unicamente uma linha na tabela");
        JRadioButton opcao1_2 = new JRadioButton("Um campo que pode ser nulo");
        JRadioButton opcao1_3 = new JRadioButton("Um campo para armazenar chaves estrangeiras");
        JRadioButton opcao1_4 = new JRadioButton("Um campo que calcula dados automaticamente");

        // Agrupando as opções para garantir que apenas uma possa ser selecionada
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(opcao1_1);
        grupo1.add(opcao1_2);
        grupo1.add(opcao1_3);
        grupo1.add(opcao1_4);

        // Definindo as posições das alternativas horizontalmente
        opcao1_1.setBounds(100, 140, 350, 30);
        opcao1_2.setBounds(500, 140, 350, 30);
        opcao1_3.setBounds(100, 180, 350, 30);
        opcao1_4.setBounds(500, 180, 350, 30);

        add(opcao1_1);
        add(opcao1_2);
        add(opcao1_3);
        add(opcao1_4);

        // Questão 2
        JLabel pergunta2 = new JLabel("Questão 2: O que é uma chave estrangeira?");
        pergunta2.setBounds(100, 220, 600, 30);
        add(pergunta2);

        JRadioButton opcao2_1 = new JRadioButton("Um campo para armazenar valores únicos");
        JRadioButton opcao2_2 = new JRadioButton("Um campo que referencia a chave primária de outra tabela");
        JRadioButton opcao2_3 = new JRadioButton("Um campo que armazena dados temporários");
        JRadioButton opcao2_4 = new JRadioButton("Um campo que define restrições");

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(opcao2_1);
        grupo2.add(opcao2_2);
        grupo2.add(opcao2_3);
        grupo2.add(opcao2_4);

        // Definindo as posições das alternativas horizontalmente
        opcao2_1.setBounds(100, 260, 350, 30);
        opcao2_2.setBounds(500, 260, 350, 30);
        opcao2_3.setBounds(100, 300, 350, 30);
        opcao2_4.setBounds(500, 300, 350, 30);

        add(opcao2_1);
        add(opcao2_2);
        add(opcao2_3);
        add(opcao2_4);

        // Questão 3
        JLabel pergunta3 = new JLabel("Questão 3: O que significa normalização de dados?");
        pergunta3.setBounds(100, 340, 600, 30);
        add(pergunta3);

        JRadioButton opcao3_1 = new JRadioButton("Remover dados duplicados");
        JRadioButton opcao3_2 = new JRadioButton("Criar um banco de dados");
        JRadioButton opcao3_3 = new JRadioButton("Simplificar consultas SQL");
        JRadioButton opcao3_4 = new JRadioButton("Alterar o formato dos dados");

        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(opcao3_1);
        grupo3.add(opcao3_2);
        grupo3.add(opcao3_3);
        grupo3.add(opcao3_4);

        // Definindo as posições das alternativas horizontalmente
        opcao3_1.setBounds(100, 380, 350, 30);
        opcao3_2.setBounds(500, 380, 350, 30);
        opcao3_3.setBounds(100, 420, 350, 30);
        opcao3_4.setBounds(500, 420, 350, 30);

        add(opcao3_1);
        add(opcao3_2);
        add(opcao3_3);
        add(opcao3_4);

        // Removendo a questão 4 e suas alternativas

        // Botão para enviar respostas
        JButton botaoEnviar = new JButton("Enviar Respostas");
        botaoEnviar.setBounds(100, 480, 200, 40);
        botaoEnviar.addActionListener(e -> {
            acertos = 0;

            if (opcao1_1.isSelected()) acertos++; // Resposta correta da questão 1
            if (opcao2_2.isSelected()) acertos++; // Resposta correta da questão 2
            if (opcao3_1.isSelected()) acertos++; // Resposta correta da questão 3

            if (acertos >= 2) { // Verifica se o usuário acertou pelo menos 2 questões
                JOptionPane.showMessageDialog(this, "\"Parabéns! Você acertou \" + acertos + \" de 3 questões. Agora, para concluir o módulo, responda uma questão de sustentabilidade:\"");
                dispose();
                new PaginaQuestaoSustentabilidade().setVisible(true); // Abre a questão de sustentabilidade
            } else {
                JOptionPane.showMessageDialog(this, "Você teve \" + acertos + \" acertos entre as 3 questões. Precisa de no minímo 2!! Tente novamente");
            }
        });
        add(botaoEnviar);
    }
}
