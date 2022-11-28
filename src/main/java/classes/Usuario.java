package classes;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;
	private String email;
	private String senha;
	
	public Usuario() {}
	
	public Usuario(String email, String senha) {
		this(-1L, email, senha);
	}

	public Usuario(long idUsuario, String email, String senha) {
		this.idUsuario = idUsuario;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", senha=" + senha + "]";
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, idUsuario, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && idUsuario == other.idUsuario && Objects.equals(senha, other.senha);
	}   
}
