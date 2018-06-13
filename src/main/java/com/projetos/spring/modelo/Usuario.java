package com.projetos.spring.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Generated(GenerationTime.INSERT)
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true)
	protected Long id;

	@Column(name = "nome", nullable = false, length = 128)
	private String nome;

	@NotNull
	@NotEmpty
	@Column(name = "email", nullable = false, length = 128, unique = true)
	@Email(message = "Isto n�o � um email v�lido")

	private String email;

	@Column(name = "data_Cadastro", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro = new Date();

	@NotNull
	@NotEmpty
	@Size(min = 8, max = 32, message = "Login muito curto ou muito Longo")
	@Column(name = "login", nullable = false, length = 64, unique = true)
	private String login;

	@Column(name = "twitter", nullable = true, length = 64, unique = true)
	private String twitter;

	private transient String senha;

	@Column(name = "ultimo_login", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimoLogin;

	@Column(name = "hash_senha", nullable = false, length = 128)
	private String hashSenha;

	public String getHashSenha() {
		return hashSenha;
	}

	public void setHashSenha(String valor) {
		hashSenha = valor;
	}

	public Date getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(Date data) {
		ultimoLogin = data;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		setHashSenha(org.apache.commons.codec.digest.DigestUtils.sha256Hex(senha));
		this.senha = senha;
	}

}
