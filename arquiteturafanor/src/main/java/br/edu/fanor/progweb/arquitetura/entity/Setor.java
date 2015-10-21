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
@Table(name = "setor")
public class Setor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_setor;

	@Column(nullable = false)
	private String setor;

        @Column(nullable = false)
	private String desc_setor;

	public Integer getId_setor() {
		return id_setor;
	}

	public void setId_setor(Integer id_setor) {
		this.id_setor = id_setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

        public String getDesc_setor() {
		return desc_setor;
	}

	public void setDesc_setor(String desc_setor) {
		this.desc_setor = desc_setor;
	}      
}