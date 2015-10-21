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
@Table(name = "atende")
public class Atende {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_atende;

        @Column(unique = true, nullable = false)
	private Integer id_setor;

        @Column(unique = true, nullable = false)
	private Integer id_atendente;
        
        @Column(unique = true, nullable = false)
    	private Integer id_aluno;

	@Column(nullable = false)
	private String documentacao;

	@Column(nullable = false)
	private String tipo_atendimento;


	public Integer getId_atende() {
		return id_atende;
	}

	public void setId_atende(Integer id_atende) {
		this.id_atende =id_atende;
	}

	public String getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(String documentacao) {
		this.documentacao = documentacao;
	}

	public String getTipo_atendimento() {
		return tipo_atendimento;
	}

	public void setTipo_atendimento(String tipo_atendimento) {
		this.tipo_atendimento = tipo_atendimento;
	}

	public Integer getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
	}

        public Integer getId_atendente() {
		return id_atendente;
	}

	public void setId_atendente(Integer id_atendente) {
		this.id_atendente = id_atendente;
	}
}