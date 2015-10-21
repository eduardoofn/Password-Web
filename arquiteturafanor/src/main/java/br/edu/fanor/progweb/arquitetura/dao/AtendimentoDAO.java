package br.edu.fanor.progweb.arquitetura.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class AtendimentoDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<AtendimentoDAO> buscarPorMatricula(Integer id_atendimento) {
		Query query = em.createQuery("select i from Atendimento i where i.id_atendimento = :id_atendimento");
		query.setParameter("Id_atendimento", id_atendimento);
		return query.getResultList();
	}
	
	public AtendimentoDAO getPorId_atendimento(Long id_atendimento) {
		return em.find(AtendimentoDAO.class, id_atendimento);
	}
	
	public void salvar(AtendimentoDAO atendimento){
		em.persist(atendimento);
	}
	
	public void editar(AtendimentoDAO atendimento){
		em.merge(atendimento);
	}

	public void excluir(AtendimentoDAO atendimento){
		em.remove(atendimento);
	}
	
}
