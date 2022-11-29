package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import classes.Usuario;
import util.JPAUtil;

public class UsuarioDAO {

	private EntityManager em;

	public UsuarioDAO() {
	}

	public boolean insert(Usuario usuario) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			e.printStackTrace();
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public boolean update(Usuario usuario) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(usuario);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public Usuario find(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Usuario usuario = em.find(Usuario.class, id);
			return usuario;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		}
	}

	public List<Usuario> findEmail(String email) {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u where u.email = :email", Usuario.class);
			query.setParameter("email", email);
			List<Usuario> users = query.getResultList();

			return users;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			return null;
		}
	}

	public boolean confirmUser(String email, String senha) {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u "
					+ "WHERE u.email = :email AND u.senha = :senha",
					Usuario.class);
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			return !query.getResultList().isEmpty();

		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			return false;
		}
	}

	public boolean remove(Long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Usuario entity = em.find(Usuario.class, id);
			em.remove(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public List<Usuario> listAll() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Usuario> query = em.createQuery("SELECT obj FROM Usuario obj", Usuario.class);
			List<Usuario> clientes = query.getResultList();
			return clientes;
		} catch (RuntimeException e) {
			e.printStackTrace();
			return null;
		}
	}
}
