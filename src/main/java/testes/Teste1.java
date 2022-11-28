package testes;

import java.util.LinkedList;
import java.util.List;

import classes.Programador;
import dao.ProgramadorDAO;

public class Teste1 {

	public static void main(String[] args) {

		List<String> projs = new LinkedList<>();
		projs.add("Sistema contábil");
		projs.add("Banco Imobiliário online");
		projs.add("Melhorias no Moodle");

		Programador programador1 = new Programador("Miguel", "Rua D", "miguel@email.com", 4500.0, "123456789-10",
				"Java", projs);

		ProgramadorDAO objDAO = new ProgramadorDAO();

//		if(objDAO.insert(programador1)) {
//			System.out.println("Programador adicionado ao BD com sucesso.");
//		}

		if (objDAO.remove(2L)) {
			System.out.println("Programador removido do BD com sucesso.");
		}
	}
}