package com.knowhow.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConexao {
    // Definindo parâmetros para a conexão
    private static final String URL = "jdbc:mysql://localhost:3306/master";
    private static final String USUARIO = "";
    private static final String SENHA = ""; // Coloque a senha do seu MySQL, se houver

    // Método para obter conexão com o banco
    public static Connection conectar() {
        Connection conexao = null;
        try {
            // Carregando o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Tentando estabelecer conexão
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
        return conexao;
    }

}