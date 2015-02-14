package br.com.helpsystem.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "usuario")
public class Usuario extends EntidadeHelpSystem {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 3375035362971303730L;

	/** Atributo nome. */
	@NotEmpty
	private String nome;

	/** Atributo email. */
	@Email
	@NotEmpty
	private String email;

	/** Atributo senha. */
	@NotEmpty
	private String senha;

	/** Atributo confirmaSenha. */
	private transient String confirmaSenha;

	/**
	 * Retorna o valor do atributo <code>nome</code>
	 *
	 * @return <code>String</code>
	 */
	public String getNome() {

		return nome;
	}

	/**
	 * Define o valor do atributo <code>nome</code>.
	 *
	 * @param nome
	 */
	public void setNome(String nome) {

		this.nome = nome;
	}

	/**
	 * Retorna o valor do atributo <code>email</code>
	 *
	 * @return <code>String</code>
	 */
	public String getEmail() {

		return email;
	}

	/**
	 * Define o valor do atributo <code>email</code>.
	 *
	 * @param email
	 */
	public void setEmail(String email) {

		this.email = email;
	}

	/**
	 * Retorna o valor do atributo <code>senha</code>
	 *
	 * @return <code>String</code>
	 */
	public String getSenha() {

		return senha;
	}

	/**
	 * Define o valor do atributo <code>senha</code>.
	 *
	 * @param senha
	 */
	public void setSenha(String senha) {

		this.senha = senha;
	}

	/**
	 * Retorna o valor do atributo <code>confirmaSenha</code>
	 *
	 * @return <code>String</code>
	 */
	public String getConfirmaSenha() {

		return confirmaSenha;
	}

	/**
	 * Define o valor do atributo <code>confirmaSenha</code>.
	 *
	 * @param confirmaSenha
	 */
	public void setConfirmaSenha(String confirmaSenha) {

		this.confirmaSenha = confirmaSenha;
	}

}
