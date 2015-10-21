package br.edu.fanor.progweb.arquitetura.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class AtendeDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<AtendeDAO> buscarPorMatricula(Integer id_atende) {
		Query query = em.createQuery("select i from Atendente i where i.id_atende = :id_atende");
		query.setParameter("Id_atend", id_atende);
		return query.getResultList();
	}
	
	public AtendeDAO getPorId_atende(Long id_atende) {
		return em.find(AtendeDAO.class, id_atende);
	}
	
	public void salvar(AtendeDAO atende){
		em.persist(atende);
	}
	
	public void editar(AtendeDAO atende){
		em.merge(atende);
	}

	public void excluir(AtendeDAO atende){
		em.remove(atende);
	}	
}