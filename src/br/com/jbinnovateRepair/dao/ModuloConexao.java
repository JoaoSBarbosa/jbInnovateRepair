package br.com.jbinnovateRepair.dao;

import java.sql.*;

/**
 *
 * @author João Barbosa
 */
public class ModuloConexao {

    // Connection-> conjuntos funcionalidades do msql
    public static Connection conector() {
        java.sql.Connection conexao = null;

        // chamando driver importado
        String driver = "com.mysql.jdbc.Driver";

        // var do banco
        String url = "jdbc:mysql://localhost:3309/db_jbdesk";
        String user = "root";
        String password = "08579010";

        // estabelecendo conecxão com BD
        try {
            //executa o driver
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println("ERRO: "+e);
            return null;
        }

    }
}
