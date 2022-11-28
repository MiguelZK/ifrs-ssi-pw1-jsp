package testes;

import classes.Usuario;
import dao.UsuarioDAO;

public class Teste2 {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("miguel@email.com", "123456789-10");

		UsuarioDAO objDAO = new UsuarioDAO();

		if(objDAO.insert(usuario1)) {
			System.out.println("Usuario adicionado ao BD com sucesso.");
		}

//		if (objDAO.remove(2L)) {
//			System.out.println("Usuario removido do BD com sucesso.");
//		}
	}
}
