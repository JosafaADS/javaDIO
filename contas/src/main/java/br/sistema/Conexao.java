package br.sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static final String URL = /* "localhost:3306";*/ "jdbc:mysql:192.xxx.xxx.xxx:xxxx/nomeDaBaseDados";
    public static final String USUARIO = "dba";
    public static final String SENHA = "#00112211AcademiaBaseDados";

    public static Connection conectaBD() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

}
