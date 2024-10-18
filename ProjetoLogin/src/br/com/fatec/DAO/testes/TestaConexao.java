package br.com.fatec.DAO.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fatec.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conexao;

		conexao= ConnectionFactory.createConnection();
		if(conexao != null)
		System.out.println("Conexão aberta com sucesso");
		else
		System.out.println("Falha em abrir conexão");

	}

}
