package modulos;
import javax.swing.*;
import java.awt.*;

public class QuestoesPOO extends JFrame {
    private int acertos = 0;

    public QuestoesPOO() {
        setTitle("Questões de Programação Orientada a Objetos");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Questão 1
        JLabel pergunta1 = new JLabel("1. O que é POO (Programação Orientada a Objetos)");
        pergunta1.setBounds(100, 100, 600, 30);
        add(pergunta1);

        JRadioButton opcao1_1 = new JRadioButton("Uma abordagem que permite organizar o código em classes e objetos, promovendo reutilização e organização.");
        JRadioButton opcao1_2 = new JRadioButton("Uma abordagem onde o código é escrito de forma linear, sem reutilização de componentes.");
        JRadioButton opcao1_3 = new JRadioButton("Um modelo de programação onde se usa apenas funções para estruturar o código.");
        JRadioButton opcao1_4 = new JRadioButton("Uma técnica para escrever código sem a necessidade de classes ou objetos.");

        opcao1_1.setBounds(100, 140, 650, 30);
        opcao1_2.setBounds(100, 180, 650, 30);
        opcao1_3.setBounds(100, 220, 650, 30);
        opcao1_4.setBounds(100, 260, 650, 30);

        add(opcao1_1);
        add(opcao1_2);
        add(opcao1_3);
        add(opcao1_4);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(opcao1_1);
        grupo1.add(opcao1_2);
        grupo1.add(opcao1_3);
        grupo1.add(opcao1_4);

        // Questão 2
        JLabel pergunta2 = new JLabel("2. Qual é o papel de um construtor em uma classe em POO?");
        pergunta2.setBounds(100, 300, 600, 30);
        add(pergunta2);

        JRadioButton opcao2_1 = new JRadioButton("O construtor é uma função responsável por exibir o conteúdo da classe no console.");
        JRadioButton opcao2_2 = new JRadioButton("O construtor serve para destruir objetos criados a partir da classe.");
        JRadioButton opcao2_3 = new JRadioButton("O construtor é usado para instanciar a classe e inicializar seus atributos de forma automática.");
        JRadioButton opcao2_4 = new JRadioButton("O construtor é usado para alterar os atributos de uma classe sem a necessidade de instanciar um objeto.");

        opcao2_1.setBounds(100, 340, 650, 30);
        opcao2_2.setBounds(100, 380, 650, 30);
        opcao2_3.setBounds(100, 420, 650, 30);
        opcao2_4.setBounds(100, 460, 650, 30);

        add(opcao2_1);
        add(opcao2_2);
        add(opcao2_3);
        add(opcao2_4);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(opcao2_1);
        grupo2.add(opcao2_2);
        grupo2.add(opcao2_3);
        grupo2.add(opcao2_4);

        // Questão 3
        JLabel pergunta3 = new JLabel("3. Qual é a principal vantagem de usar um construtor em uma classe em vez de inicializar atributos manualmente?");
        pergunta3.setBounds(100, 500, 700, 30);
        add(pergunta3);

        JRadioButton opcao3_1 = new JRadioButton("O construtor torna o código mais dinâmico e limpo, pois os atributos são inicializados automaticamente.");
        JRadioButton opcao3_2 = new JRadioButton("O construtor permite a criação de atributos sem a necessidade de declarar variáveis.");
        JRadioButton opcao3_3 = new JRadioButton("O construtor faz com que o código execute mais rapidamente.");
        JRadioButton opcao3_4 = new JRadioButton("O construtor elimina a necessidade de usar objetos na programação orientada a objetos.");

        opcao3_1.setBounds(100, 540, 650, 30);
        opcao3_2.setBounds(100, 580, 650, 30);
        opcao3_3.setBounds(100, 620, 650, 30);
        opcao3_4.setBounds(100, 660, 650, 30);

        add(opcao3_1);
        add(opcao3_2);
        add(opcao3_3);
        add(opcao3_4);

        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(opcao3_1);
        grupo3.add(opcao3_2);
        grupo3.add(opcao3_3);
        grupo3.add(opcao3_4);

        // Botão para enviar respostas
        JButton botaoEnviar = new JButton("Enviar Respostas");
        botaoEnviar.setBounds(100, 700, 200, 40);
        botaoEnviar.addActionListener(e -> {
            acertos = 0;

            if (opcao1_1.isSelected()) acertos++; // Resposta correta da questão 1
            if (opcao2_3.isSelected()) acertos++; // Resposta correta da questão 2
            if (opcao3_1.isSelected()) acertos++; // Resposta correta da questão 3

            if (acertos >= 2) { // Verifica se o usuário acertou pelo menos 2 questões
                JOptionPane.showMessageDialog(this, "Parabéns! Você acertou " + acertos + " de 3 questões. Agora, para concluir o módulo, responda uma questão de sustentabilidade:");
                dispose();
                new PaginaQuestaoSustentabilidade().setVisible(true); // Abre a questão de sustentabilidade
            } else {
                JOptionPane.showMessageDialog(this, "Você teve " + acertos + " acertos entre as 3 questões. Precisa de no minímo 2!! Tente novamente.");
            }
        });
        add(botaoEnviar);
    }
}
