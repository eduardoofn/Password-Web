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
@Table(name = "atendente")
public class Atendente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_atendente;

	@Column(nullable = false)
	private String nome;

        @Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String senha;

        @Column(unique = true, nullable = false)
	private Integer id_setor;

        @Column(unique = true, nullable = false)
	private Integer matricula;

	public Integer getId_atendente() {
		return id_atendente;
	}

	public void setId_atendente(Integer id_atendente) {
		this.id_atendente = id_atendente;
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

        public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

        public Integer getCurso() {
		return id_setor;
	}

	public void setId_setor(Integer id_setor) {
		this.id_setor = id_setor;
	}

        public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
}