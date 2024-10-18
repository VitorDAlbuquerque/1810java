/**
 * Pacote com padrão Factory para acesso a banco de dados
 */
package br.com.fatec.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe de conexão 
 */
public class ConnectionFactory {
	private static final String USERNAME="root";
    private static final String PASSWORD="alunofatec";
    private static final String DATABASE_URL="jdbc:mysql://localhost:3306/bancoteste";
    
    public static Connection createConnection() throws SQLException, ClassNotFoundException{
       Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return conn;
}

}
