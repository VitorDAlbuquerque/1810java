package br.com.fatec.DAO.testes;


import java.sql.SQLException;

import br.com.fatec.DAO.UsuarioDao;
import br.com.fatec.model.Usuario;

public class TestaInsereeListar {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		UsuarioDao.insere(new Usuario("Sirley Addão","sirley.gmail.com","1234"));
		UsuarioDao.insere(new Usuario("Raul Costa","raul.gmail.com","1234"));
		UsuarioDao.insere(new Usuario("Luciana Pereira","luciana.gmail.com","1234"));
		UsuarioDao.insere(new Usuario("Felipe da Silva","silva.gmail.com","1234"));
		UsuarioDao.insere(new Usuario("Fabiana Torres","luciana.gmail.com","1234"));
		System.out.println(UsuarioDao.listarBD());
        System.out.println("teste update de usuario de id 5");
        UsuarioDao.update(new Usuario(5, "Teste altera", "teste", "teste"));
        System.out.println(UsuarioDao.listarBD());


	}

}
