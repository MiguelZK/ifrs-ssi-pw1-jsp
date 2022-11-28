package testes;

import classes.Usuario;
import dao.ProgramadorDAO;
import dao.UsuarioDAO;

public class Teste3 {

	public static void main(String[] args) {

		UsuarioDAO objDAO = new UsuarioDAO();
		ProgramadorDAO progDAO = new ProgramadorDAO();
		
		/*
		 * objDAO.insert(new Usuario("terra@gmail.com", "asdfgzxcvb"));
		 * objDAO.insert(new Usuario("jocelma@email.com", "qwerasdf"));
		 */
		System.out.println(objDAO.findEmail("joao@email.com"));
		
		System.out.println(progDAO.listAll());

//		if (objDAO.remove(2L)) {
//			System.out.println("Usuario removido do BD com sucesso.");
//		}
	}
}
