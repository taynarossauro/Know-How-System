package com.knowhow.modulos;
import javax.swing.*;

public class PaginaQuestoesModulo extends JFrame {
    private int acertos = 0;
    public PaginaQuestoesModulo(String moduloSelecionado) {
        setTitle("Questões do Módulo");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

    JLabel pergunta1 = new JLabel("dasd");
   
    if ("POO".equals(moduloSelecionado)) {
        pergunta1.setText("Qual é o conceito de POO?");
        pergunta1.setBounds(400, 100, 300, 30);
        add(pergunta1);
        JRadioButton opcao1 = new JRadioButton("Programação Orientada a Objetos");
        opcao1.setBounds(400, 140, 300, 30);
        add(opcao1);

        JRadioButton opcao2 = new JRadioButton("Programação Operacional");
        opcao2.setBounds(510, 140, 200, 30);
        add(opcao2);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(opcao1);
        grupo1.add(opcao2);

        // Questão 2 para POO
        JLabel pergunta2 = new JLabel("O que é encapsulamento?");
        pergunta2.setBounds(400, 200, 300, 30);
        add(pergunta2);

        JRadioButton opcao3 = new JRadioButton("Esconder detalhes internos");
        opcao3.setBounds(400, 240, 200, 30);
        add(opcao3);

        JRadioButton opcao4 = new JRadioButton("Dividir o código em módulos");
        opcao4.setBounds(510, 240, 200, 30);
        add(opcao4);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(opcao3);
        grupo2.add(opcao4);
        
        if (opcao2.isSelected()) acertos++; 
        if (opcao1.isSelected()) acertos++; 
        
    } else {
    // Método para criar as questões do módulo BD
        // Questão 1 para BD
    	pergunta1.setText("Qual comando SQL é utilizado para selecionar dados?");
        pergunta1.setBounds(400, 100, 300, 30);
        add(pergunta1);

        JRadioButton opcao1 = new JRadioButton("SELECT");
        opcao1.setBounds(400, 140, 100, 30);
        add(opcao1);

        JRadioButton opcao2 = new JRadioButton("INSERT");
        opcao2.setBounds(510, 140, 100, 30);
        add(opcao2);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(opcao1);
        grupo1.add(opcao2);

        // Questão 2 para BD
        JLabel pergunta2 = new JLabel("Qual comando SQL é usado para adicionar dados?");
        pergunta2.setBounds(400, 200, 300, 30);
        add(pergunta2);

        JRadioButton opcao3 = new JRadioButton("INSERT");
        opcao3.setBounds(400, 240, 100, 30);
        add(opcao3);

        JRadioButton opcao4 = new JRadioButton("DELETE");
        opcao4.setBounds(510, 240, 100, 30);
        add(opcao4);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(opcao3);
        grupo2.add(opcao4);
            if (opcao1.isSelected()) acertos++; 
            if (opcao1.isSelected()) acertos++; 

    }
    JButton botaoEnviar = new JButton("Enviar Respostas");
    botaoEnviar.setBounds(500, 500, 200, 40);
    botaoEnviar.addActionListener(e -> {
        acertos = 0;

        if (acertos <= 2) {
            JOptionPane.showMessageDialog(this, "Você errou. Tente novamente.");
        } else {
            dispose();
            new PaginaQuestaoSustentabilidade().setVisible(true);
        }
    });
    add(botaoEnviar);
}
}
