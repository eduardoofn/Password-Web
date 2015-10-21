package br.edu.fanor.progweb.arquitetura.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


@Repository
public class AlunoDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<AlunoDAO> buscarPorMatricula_cpf(String matricula_cpf) {
		Query query = em.createQuery("select a from Alunos a where a.matricula_cpf = :matricula_cpf");
		query.setParameter("Matricula_cpf", matricula_cpf);
		return query.getResultList();
	}
	
	public AlunoDAO getPorId_alunos(Long id_aluno) {
		return em.find(AlunoDAO.class, id_aluno);
	}
	
	public void salvar(AlunoDAO alunos){
		em.persist(alunos);
	}
	
	public void editar(AlunoDAO alunos){
		em.merge(alunos);
	}

	public void excluir(AlunoDAO alunos){
		em.remove(alunos);
	}
	
}
