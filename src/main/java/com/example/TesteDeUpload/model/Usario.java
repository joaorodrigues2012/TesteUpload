package com.example.TesteDeUpload.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="usuario")
public class Usario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7420545781644725491L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="Sobrenome")
	private String Sobrenome;
	@Column(name="eamil")
	private String eamil;
	@Column(name="telefone")
	private String telefone;
	@Column(name="Data_Criado")
	private Date DataCriado;
	@Column(name="Data_Upload")
	private Date DataUpload;
	
	@Transient
	private List<MultipartFile> files = new ArrayList<>();
	@Transient
	private List<String> removeImagem = new ArrayList<String>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDataCriado() {
		return DataCriado;
	}
	public void setDataCriado(Date dataCriado) {
		DataCriado = dataCriado;
	}
	public Date getDataUpload() {
		return DataUpload;
	}
	public void setDataUpload(Date dataUpload) {
		DataUpload = dataUpload;
	}
	public List<MultipartFile> getFiles() {
		return files;
	}
	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}
	public List<String> getRemoveImagem() {
		return removeImagem;
	}
	public void setRemoveImagem(List<String> removeImagem) {
		this.removeImagem = removeImagem;
	}
	
	
	
}
