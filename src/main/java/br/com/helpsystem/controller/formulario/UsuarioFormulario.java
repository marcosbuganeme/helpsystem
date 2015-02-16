package br.com.helpsystem.controller.formulario;

import br.com.helpsystem.modelo.Usuario;

public class UsuarioFormulario extends Formulario<Usuario> {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 7656342723676435119L;

	/** Atributo nome. */
	private String nome;

	/** Atributo email. */
	private String email;

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

}
