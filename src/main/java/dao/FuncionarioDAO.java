package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import classes.Funcionario;
import util.JPAUtil;

public class FuncionarioDAO {

	private EntityManager em;
	
	public FuncionarioDAO() {}

	public boolean insert(Funcionario funcionario) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(funcionario);
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

	public boolean update(Funcionario funcionario) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(funcionario);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}
	
	public Funcionario find(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Funcionario pessoafisica = em.find(Funcionario.class, id);
			return pessoafisica;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public boolean remove(Long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Funcionario entity = em.find(Funcionario.class, id);
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

	public List<Funcionario> listAll() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Funcionario> query = em.createQuery("SELECT obj FROM Funcionario obj", Funcionario.class);
			List<Funcionario> clientes = query.getResultList();
			return clientes;
		} catch (RuntimeException e) {
			e.printStackTrace();
			return null;
		} 
	}
}
