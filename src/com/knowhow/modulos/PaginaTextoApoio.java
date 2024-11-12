package com.knowhow.modulos;
import javax.swing.*;

public class PaginaTextoApoio extends JFrame {
    public PaginaTextoApoio(String materia) {
        setTitle("Texto de Apoio - " + materia);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String texto;
        if (materia.equals("POO")) {
            texto = "O que é?\n"
                    + "Basicamente, POO é a programação de uma forma mais estrutural, onde são criados objetos, métodos, classes, atributos e construtores, que irão gerar um código, com a finalidade com a qual o programador deseja.\n"
                    + "Primeiramente, iremos criar nossos atributos, que no caso da classe “Cão”, será definido por “Nome”, “Raça” e “Idade”.\n"
                    + "Temos a inicialização do Atributo diretamente na classe principal, ou seja, cada um deles será iniciado separadamente ou individualmente, usando String para Especie, Nome e Raça e int(número inteiro) para a idade do pet, e logo em seguida, sendo mostrado dentro do programa. Segue o exemplo:\n"
                    + "\nclass Pet {\n"
                    + "   // Atributos da nossa classe:\n"
                    + "    String especie;\n"
                    + "    String nome;\n"
                    + "    String raça;\n"
                    + "    int idade;\n"
                    + "}\n"
                    + "\npublic class Animal {\n"
                    + "    public static void main(String[] args) {\n"
                    + "        // Aqui nós criaremos nossa variável para podermos criar nossos atributos.\n"
                    + "        Pet pet = new Pet();\n"
                    + "        \n"
                    + "        // Neste momento, iremos instanciar ou \"chamar\" cada um de nossos atributos da classe.\n"
                    + "        pet.especie = \"Cachorro\";\n"
                    + "        pet.nome = \"Totó\";\n"
                    + "        pet.raça = \"Vira-Lata\";\n"
                    + "        pet.idade = 4;\n"
                    + "        \n"
                    + "        // Por fim, instanciamos eles (mostrar).\n"
                    + "        System.out.println(\"Espécie do pet: \" + pet.especie);\n"
                    + "        System.out.println(\"Nome: \" + pet.nome);\n"
                    + "        System.out.println(\"Raça: \" + pet.raça);\n"
                    + "        System.out.println(\"Idade: \" + pet.idade + \" anos\");\n"
                    + "    }\n"
                    + "}\n"
                    + "No console aparecerá:\n"
                    + "\nEspécie do pet: Cachorro\n"
                    + "Nome: Totó\n"
                    + "Raça: Vira-Lata\n"
                    + "Idade: 4 anos\n"
                    + "\n\nPor outro lado, usaremos o Construtor para que possamos criar estes atributos de forma que ja o inicializemos em sequencia.\r\n"
                    + "Tendo em vista que o uso do Construtor torna a programação mais dinâmica e deixando-o com uma forma mais “limpa” dentro da nossa classe principal.\r\n"
                    + "Segue o exemplo:\n"
                    + "\nclass Pet {\r\n"
                    + "    // Estes abaixo são os atributos que serão criados na nossa classe:\r\n"
                    + "    String especie;\r\n"
                    + "    String nome;\r\n"
                    + "    String raça;\r\n"
                    + "    int idade;\r\n"
                    + "\r\n"
                    + "    // Este é o CONSTRUTOR da nossa classe, que irá iniciar nossos atributos.\r\n"
                    + "    Pet(String especie, String nome, String raça, int idade) {\r\n"
                    + "        this.especie = especie;\r\n"
                    + "        this.nome = nome;\r\n"
                    + "        this.raça = raça;\r\n"
                    + "        this.idade = idade;\r\n"
                    + "    }\r\n"
                    + "\r\n"
                    + "    // Usamos este \"String geral()\" para chamarmos os nossos atributos.\r\n"
                    + "    String geral() {\r\n"
                    + "        return\r\n"
                    + "            \"Especie do pet: \" + this.especie +\r\n"
                    + "            \"\\nNome: \" + this.nome +\r\n"
                    + "            \"\\nRaça: \" + this.raça +\r\n"
                    + "            \"\\nIdade: \" + this.idade;\r\n"
                    + "    }\r\n"
                    + "}\r\n"
                    + "\r\n"
                    + "public class Animal {\r\n"
                    + "    public static void main(String[] args) {\r\n"
                    + "        // Uma vez na classe principal, precisamos apenas instanciá-los (mostrar).\r\n"
                    + "        Pet pet = new Pet(\"Gato\", \"Gigi\", \"Persa\", 5);\r\n"
                    + "        System.out.println(pet.geral());\r\n"
                    + "    }\r\n"
                    + "}\r\n"
                    + "\n\nOque será mostrado no console:\n"
                    + "\nEspecie do pet: Gato\r\n"
                    + "Nome: Gigi\r\n"
                    + "Raça: Persa\r\n"
                    + "Idade: 5\r\n";
            
        } else if (materia.equals("BD (SQL)")) {
            texto = "O que é SQL?\r\n"
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
            		+ "Por exemplo, se o Departamento de Veículos Motorizados tivesse um banco de dados, você poderia encontrar uma tabela contendo todos os veículos conhecidos que as pessoas no estado estão dirigindo. Esta tabela poderia armazenar o nome do modelo, tipo, número de rodas e número de portas de cada veículo, por exemplo."
            		+ "Entendendo o Comando SELECT\r\n"
            		+ "O comando SELECT é uma das ferramentas mais importantes no SQL, usado para buscar dados de uma tabela em um banco de dados relacional. Com ele, você pode selecionar e visualizar informações específicas de maneira rápida e eficiente.\r\n"
            		+ "\r\n"
            		+ "Sintaxe Básica do SELECT\r\n"
            		+ "SELECT coluna1, coluna2, ...\r\n"
            		+ "FROM nome_da_tabela;";
        } else {
            texto = "Texto de apoio genérico para outras matérias.";
        }

     
        JTextArea textoApoioArea = new JTextArea(texto);
        textoApoioArea.setLineWrap(true);      
        textoApoioArea.setWrapStyleWord(true); 
        textoApoioArea.setEditable(false);     

        JScrollPane scrollPane = new JScrollPane(textoApoioArea);
        scrollPane.setBounds(50, 50, 1200, 600); 
        add(scrollPane);
        
        /*
        JButton botaoSeguir = new JButton("Seguir para questões");
        botaoSeguir.setBounds(600, 700, 200, 40); 
        botaoSeguir.addActionListener(e -> {
            dispose();
            new PaginaQuestoesModulo().setVisible(true);
        });
        add(botaoSeguir);*/
    }
}
