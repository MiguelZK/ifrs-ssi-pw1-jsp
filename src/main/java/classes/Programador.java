package classes;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Programador
 *
 */
@Entity
public class Programador extends Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String linguagemProg;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> projetos;

	public Programador() {
		super();
	}

	public Programador(String nome, String email, String endereco, double salario, String cpf, String linguagemProg, List<String> projetos) {
		super(nome, email, endereco, salario, cpf);
		this.linguagemProg = linguagemProg;
		this.projetos = projetos;
	}

	public String getLinguagemProg() {
		return linguagemProg;
	}

	public void setLinguagemProg(String linguagemProg) {
		this.linguagemProg = linguagemProg;
	}

	public List<String> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<String> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return super.toString() + "\nProgramador [linguagemProg=" + linguagemProg + ", projetos=" + projetos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(linguagemProg, projetos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programador other = (Programador) obj;
		return Objects.equals(linguagemProg, other.linguagemProg) && Objects.equals(projetos, other.projetos);
	}
   
}
