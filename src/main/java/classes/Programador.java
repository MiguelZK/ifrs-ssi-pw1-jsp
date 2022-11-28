package classes;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import dao.ProgramadorDAO;

/**
 * Entity implementation class for Entity: Programador
 *
 */
@Entity
public class Programador extends Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String linguagemProg;
	private String projetos;

	public Programador() {
		super();
	}

	public Programador(String nome, String email, String endereco, double salario, String cpf, String linguagemProg, String projetos) {
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

	public String getProjetos() {
		return projetos;
	}

	public void setProjetos(String projetos) {
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
	
	public boolean insert() {
		//manda salvar o objeto atual
		return new ProgramadorDAO().insert(this);
	}
	public List<Programador> listAll(){
		return new ProgramadorDAO().listAll();
	}
	public boolean update(){
		//manda editar/atualizar o objeto atual
		return new ProgramadorDAO().update(this);
	}
	public boolean remove(){
		return new ProgramadorDAO().remove(this.getIdFuncionario());
	}
	public Programador find(){
		return new ProgramadorDAO().find(this.getIdFuncionario());
	}
   
}
