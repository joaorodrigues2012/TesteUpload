package com.example.TesteDeUpload.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_file")
public class UserFiles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3233511452457565080L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="nomeArquivo")
	private String nomeArquivo;
	@Column(name="ModificacaoArquivo")
	private String ModificacaoArquivo;
	@Column(name="fileEntensao")
	private String fileEntensao;
	
	@ManyToOne
	@JoinColumn(name="usario_id")
	private Usario usario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	public String getModificacaoArquivo() {
		return ModificacaoArquivo;
	}
	public void setModificacaoArquivo(String modificacaoArquivo) {
		ModificacaoArquivo = modificacaoArquivo;
	}
	public String getFileEntensao() {
		return fileEntensao;
	}
	public void setFileEntensao(String fileEntensao) {
		this.fileEntensao = fileEntensao;
	}
	public Usario getUsario() {
		return usario;
	}
	public void setUsario(Usario usario) {
		this.usario = usario;
	}
	
	
}
