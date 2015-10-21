package br.edu.fanor.progweb.arquitetura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Eduardo Oliveira
 * 
 */
@Entity
@Table(name = "alunos")
public class Alunos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_aluno;

	@Column(nullable = false)
	private String nome;

        @Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String contato;

        @Column(nullable = false)
	private String curso;

        @Column(unique = true, nullable = false)
	private Integer matricula_cpf;

	public Integer getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
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

        public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

        public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

        public Integer getMatricula_cpf() {
		return matricula_cpf;
	}

	public void setMatricula_cpf(Integer matricula_cpf) {
		this.matricula_cpf = matricula_cpf;
	}
}