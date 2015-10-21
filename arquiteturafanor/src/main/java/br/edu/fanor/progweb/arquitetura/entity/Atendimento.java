package br.edu.fanor.progweb.arquitetura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Eduardo Oliveira
 * 
 */
@Entity
@Table(name = "atendimento")
public class Atendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_atendimento;

        @Column(unique = true, nullable = false)
	private Integer id_aluno;

        @Column(unique = true, nullable = false)
	private Integer id_atendente;

	@Column(nullable = false)
	private String senha;

	public Integer getId_atendimento() {
		return id_atendimento;
	}

	public void setId_atendimento(Integer id_atendimento) {
		this.id_atendimento = id_atendimento;
	}

	public Integer getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
	}

        public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

        public Integer getId_atendente() {
		return id_atendente;
	}

	public void setId_atendente(Integer id_atendente) {
		this.id_atendente = id_atendente;
	}

}
