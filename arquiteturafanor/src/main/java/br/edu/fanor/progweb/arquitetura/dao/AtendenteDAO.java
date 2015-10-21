package br.edu.fanor.progweb.arquitetura.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class AtendenteDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<AtendenteDAO> buscarPorMatricula(String matricula) {
		Query query = em.createQuery("select a from Atendente a where a.matricula = :matricula");
		query.setParameter("Matricula", matricula);
		return query.getResultList();
	}
	
	public AtendenteDAO getPorId_atendente(Long id_atendente) {
		return em.find(AtendenteDAO.class, id_atendente);
	}
	
	public void salvar(AtendenteDAO atendente){
		em.persist(atendente);
	}
	
	public void editar(AtendenteDAO atendente){
		em.merge(atendente);
	}

	public void excluir(AtendenteDAO atendente){
		em.remove(atendente);
	}	
}