package com.projetos.spring.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name = "topico")
public class Topico {

	@Id
	@Generated(GenerationTime.INSERT)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	protected long id;

	@ManyToOne
	@JoinColumn(name = "assunto_id", nullable = false)
	private Assunto assunto;

	@ManyToOne
	@Column(name = "autor_id", nullable = false)
	private Usuario autor;

	@Column(name = "dateCadastro", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro = new Date();

	@Column(name = "titulo", nullable = false, length = 128)
	private String titulo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
