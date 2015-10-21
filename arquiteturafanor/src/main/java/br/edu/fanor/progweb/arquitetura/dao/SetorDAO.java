package br.edu.fanor.progweb.arquitetura.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public class SetorDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<SetorDAO> buscarPorId(Integer id_setor) {
		Query query = em.createQuery("select s from Setor s where s.id_setor = :id_setor");
		query.setParameter("Id_setor", id_setor);
		return query.getResultList();
	}
	
	public SetorDAO getPorId_setor(Long id_setor) {
		return em.find(SetorDAO.class, id_setor);
	}
	
	public void salvar(SetorDAO setor){
		em.persist(setor);
	}
	
	public void editar(SetorDAO setor){
		em.merge(setor);
	}

	public void excluir(SetorDAO setor){
		em.remove(setor);
	}	
}
