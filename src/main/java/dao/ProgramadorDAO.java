package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import classes.Programador;
import util.JPAUtil;

public class ProgramadorDAO {

	private EntityManager em;
	
	public ProgramadorDAO() {}

	public boolean insert(Programador programador) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(programador);
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

	public boolean update(Programador programador) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(programador);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}
	
	public Programador find(long id) {
		try {
			em = JPAUtil.getEntityManager();
			Programador pessoafisica = em.find(Programador.class, id);
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
			Programador entity = em.find(Programador.class, id);
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

	public List<Programador> listAll() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Programador> query = em.createQuery("SELECT obj FROM Programador obj", Programador.class);
			List<Programador> clientes = query.getResultList();
			return clientes;
		} catch (RuntimeException e) {
			e.printStackTrace();
			return null;
		} 
	}
}
