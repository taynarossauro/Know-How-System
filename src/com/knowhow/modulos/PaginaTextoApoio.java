package modulos;
import javax.swing.*;

public class PaginaTextoApoio extends JFrame {
    private String materiaSelecionada; // Armazena a matéria selecionada pelo usuário

    public PaginaTextoApoio(String materiaSelecionada) {
        this.materiaSelecionada = materiaSelecionada;
        setTitle("Texto de Apoio - " + materiaSelecionada);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Para deixar a tela cheia
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Para controle manual da posição dos componentes

        // Cria o JTextArea para exibir o texto de apoio
        JTextArea texto = new JTextArea();
        texto.setWrapStyleWord(true); // Faz o texto quebrar de forma inteligente
        texto.setLineWrap(true); // Quebra a linha automaticamente quando atingir o limite
        texto.setCaretPosition(0); // Para garantir que o texto comece no topo
        texto.setEditable(false); // Impede que o usuário edite o texto

        // Texto de apoio para a matéria selecionada
        if (materiaSelecionada.equals("POO")) {
            texto.setText("O que é?\n"
            		+ "Basicamente, POO é a programação de uma forma mais estrutural, onde são criados objetos, métodos, classes, atributos e construtores, que irão gerar um código, com a finalidade com a qual o programador deseja.\n"
            		+ "Primeiramente, iremos criar nossos atributos, que no caso da classe “Cão”, será definido por “Nome”, “Raça” e “Idade”.\n"
            		+ "Temos a inicialização do Atributo diretamente na classe principal, ou seja, cada um deles será iniciado separadamente ou individualmente, usando String para Especie, Nome e Raça e int (número inteiro) para a idade do pet, e logo em seguida, sendo mostrado dentro do programa. Segue o exemplo:\n\n"
            		+ "class Pet {\n"
            		+ "   // Atributos da nossa classe:\n"
            		+ "    String especie;\n"
            		+ "    String nome;\n"
            		+ "    String raça;\n"
            		+ "    int idade;\n"
            		+ "}\n\n"
            		+ "public class Animal {\n"
            		+ "    public static void main(String[] args) {\n"
            		+ "        // Aqui nós criaremos nossa variável para podermos criar nossos atributos.\n"
            		+ "        Pet pet = new Pet();\n"
            		+ "        // Neste momento, iremos instanciar ou \"chamar\" cada um de nossos atributos da classe.\n"
            		+ "        pet.especie = \"Cachorro\";\n"
            		+ "        pet.nome = \"Totó\";\n"
            		+ "        pet.raça = \"Vira-Lata\";\n"
            		+ "        pet.idade = 4;\n\n"
            		+ "        // Por fim, instanciamos eles (mostrar).\n"
            		+ "        System.out.println(\"Espécie do pet: \" + pet.especie);\n"
            		+ "        System.out.println(\"Nome: \" + pet.nome);\n"
            		+ "        System.out.println(\"Raça: \" + pet.raça);\n"
            		+ "        System.out.println(\"Idade: \" + pet.idade + \" anos\");\n"
            		+ "    }\n"
            		+ "}\n\n"
            		+ "No console aparecerá:\n"
            		+ "Espécie do pet: Cachorro\n"
            		+ "Nome: Totó\n"
            		+ "Raça: Vira-Lata\n"
            		+ "Idade: 4 anos\n\n"
            		+ "Por outro lado, usaremos o Construtor para que possamos criar estes atributos de forma que já os inicializemos em sequência.\n"
            		+ "Tendo em vista que o uso do Construtor torna a programação mais dinâmica e deixando-a com uma forma mais “limpa” dentro da nossa classe principal. Segue o exemplo:\n\n"
            		+ "class Pet {\n"
            		+ "    // Estes abaixo são os atributos que serão criados na nossa classe:\n"
            		+ "    String especie;\n"
            		+ "    String nome;\n"
            		+ "    String raça;\n"
            		+ "    int idade;\n\n"
            		+ "    // Este é o CONSTRUTOR da nossa classe, que irá iniciar nossos atributos.\n"
            		+ "    Pet(String especie, String nome, String raça, int idade) {\n"
            		+ "        this.especie = especie;\n"
            		+ "        this.nome = nome;\n"
            		+ "        this.raça = raça;\n"
            		+ "        this.idade = idade;\n"
            		+ "    }\n\n"
            		+ "    // Usamos este \"String geral()\" para chamarmos os nossos atributos.\n"
            		+ "    String geral() {\n"
            		+ "        return\n"
            		+ "            \"Espécie do pet: \" + this.especie +\n"
            		+ "            \"\\nNome: \" + this.nome +\n"
            		+ "            \"\\nRaça: \" + this.raça +\n"
            		+ "            \"\\nIdade: \" + this.idade;\n"
            		+ "    }\n"
            		+ "}\n\n"
            		+ "public class Animal {\n"
            		+ "    public static void main(String[] args) {\n"
            		+ "        // Uma vez na classe principal, precisamos apenas instanciá-los (mostrar).\n"
            		+ "        Pet pet = new Pet(\"Gato\", \"Gigi\", \"Persa\", 5);\n"
            		+ "        System.out.println(pet.geral());\n"
            		+ "    }\n"
            		+ "}\n\n"
            		+ "O que será mostrado no console:\n"
            		+ "Espécie do pet: Gato\n"
            		+ "Nome: Gigi\n"
            		+ "Raça: Persa\n"
            		+ "Idade: 5");
        } else if (materiaSelecionada.equals("BD")) {
            texto.setText("<html>O que é SQL?\r\n"
            		+ "SQL, ou Structured Query Language (Linguagem de Consulta Estruturada), é uma linguagem projetada para permitir que tanto usuários técnicos quanto não técnicos consultem, manipulem e transformem dados de um banco de dados relacional. Devido à sua simplicidade, os bancos de dados SQL oferecem armazenamento seguro e escalável para milhões de sites e aplicativos móveis.\r\n"
            		+ "\r\n"
            		+ "Bancos de Dados Populares\r\n"
            		+ "Existem muitos bancos de dados SQL populares, incluindo:\r\n"
            		+ "\r\n"
            		+ "SQLite\r\n"
            		+ "\r\n"
            		+ "MySQL\r\n"
            		+ "\r\n"
            		+ "Postgres\r\n"
            		+ "\r\n"
            		+ "Oracle\r\n"
            		+ "\r\n"
            		+ "Microsoft SQL Server\r\n"
            		+ "\r\n"
            		+ "Todos eles suportam o padrão comum da linguagem SQL, mas cada implementação pode diferir nos recursos adicionais e tipos de armazenamento que suporta.\r\n"
            		+ "\r\n"
            		+ "Bancos de Dados Relacionais\r\n"
            		+ "Antes de aprender a sintaxe SQL, é importante entender o que é um banco de dados relacional. Um banco de dados relacional representa uma coleção de tabelas relacionadas (bidimensionais). Cada tabela é semelhante a uma planilha do Excel, com um número fixo de colunas nomeadas (os atributos ou propriedades da tabela) e qualquer número de linhas de dados.\r\n"
            		+ "\r\n"
            		+ "Por exemplo, se o Departamento de Veículos Motorizados tivesse um banco de dados, você poderia encontrar uma tabela contendo todos os veículos conhecidos que as pessoas no estado estão dirigindo. Esta tabela poderia armazenar o nome do modelo, tipo, número de rodas e número de portas de cada veículo, por exemplo.</html>");
        }

        // Coloca o JTextArea dentro de um JScrollPane para adicionar a barra de rolagem
        JScrollPane scrollPane = new JScrollPane(texto);
        scrollPane.setBounds(100, 100, 1000, 500); // Aumentando a área de exibição para 1000x500
        add(scrollPane);
        texto.setCaretPosition(0);
        
        // Botão para seguir para as questões
        JButton botaoSeguir = new JButton("Seguir para questões");
        botaoSeguir.setBounds(100, 620, 200, 40); // Ajustando a posição do botão
        botaoSeguir.addActionListener(e -> {
            if (materiaSelecionada.equals("POO")) {
                new QuestoesPOO().setVisible(true);
            } else if (materiaSelecionada.equals("BD")) {
                new QuestoesBD().setVisible(true);
            }
            dispose(); // Fecha a janela atual
        });
        add(botaoSeguir);
    }
}
