package testes;

import classes.Usuario;
import dao.UsuarioDAO;

public class Teste2 {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("miguel@email.com", "123456789-10");
		Usuario usuario2 = new Usuario("joao@email.com", "123456");
		Usuario usuario3 = new Usuario("maria@email.com", "654321");

		UsuarioDAO objDAO = new UsuarioDAO();

		if(objDAO.insert(usuario2) && objDAO.insert(usuario3) && objDAO.insert(usuario1)) {
			System.out.println("Usuario adicionado ao BD com sucesso.");
		}

//		if (objDAO.remove(2L)) {
//			System.out.println("Usuario removido do BD com sucesso.");
//		}
	}
}
