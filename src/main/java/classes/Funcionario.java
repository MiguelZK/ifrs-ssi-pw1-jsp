package classes;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */
@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFuncionario;
	private String nome;
	private String email;
	private String endereco;
	private double salario;
	private String cpf;
	
	public Funcionario() {}
	
	public Funcionario(String nome, String email, String endereco, double salario, String cpf) {
		this(-1L, nome, email, endereco, salario, cpf);
	}

	public Funcionario(long idFuncionario, String nome, String email, String endereco, double salario, String cpf) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.salario = salario;
		this.cpf = cpf;
	}

	public long getIdFuncionario() {
		return idFuncionario;
	}
	
	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, endereco, idFuncionario, nome, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && idFuncionario == other.idFuncionario
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", email=" + email + ", endereco="
				+ endereco + ", salario=" + salario + ", cpf=" + cpf + "]";
	}
   
}
