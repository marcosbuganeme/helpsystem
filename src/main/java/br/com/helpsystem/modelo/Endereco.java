package br.com.helpsystem.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco extends EntidadeHelpSystem {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -7287740270026585702L;

	/** Atributo cliente. */
	@OneToOne
	@JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "FK_CLIENTE_ENDERECO"))
	private Cliente cliente;

	/** Atributo cep. */
	@Column(name = "cep", length = 8)
	private String cep;

	/** Atributo cidade. */
	private String cidade;

	/** Atributo estado. */
	private String estado;

	/** Atributo bairro. */
	private String bairro;

	/** Atributo logradouro. */
	private String logradouro;

	@Column(name = "logradouro_curto")
	private String logradouroCurto;

	/**
	 * Retorna o valor do atributo <code>cep</code>
	 *
	 * @return <code>String</code>
	 */
	public String getCep() {

		return this.cep;
	}

	/**
	 * Define o valor do atributo <code>cep</code>.
	 *
	 * @param cep
	 */
	public void setCep(final String cep) {

		this.cep = cep;
	}

	/**
	 * Retorna o valor do atributo <code>cidade</code>
	 *
	 * @return <code>String</code>
	 */
	public String getCidade() {

		return this.cidade;
	}

	/**
	 * Define o valor do atributo <code>cidade</code>.
	 *
	 * @param cidade
	 */
	public void setCidade(final String cidade) {

		this.cidade = cidade;
	}

	/**
	 * Retorna o valor do atributo <code>estado</code>
	 *
	 * @return <code>String</code>
	 */
	public String getEstado() {

		return this.estado;
	}

	/**
	 * Define o valor do atributo <code>estado</code>.
	 *
	 * @param estado
	 */
	public void setEstado(final String estado) {

		this.estado = estado;
	}

	/**
	 * Retorna o valor do atributo <code>bairro</code>
	 *
	 * @return <code>String</code>
	 */
	public String getBairro() {

		return this.bairro;
	}

	/**
	 * Define o valor do atributo <code>bairro</code>.
	 *
	 * @param bairro
	 */
	public void setBairro(final String bairro) {

		this.bairro = bairro;
	}

	/**
	 * Retorna o valor do atributo <code>logradouro</code>
	 *
	 * @return <code>String</code>
	 */
	public String getLogradouro() {

		return this.logradouro;
	}

	/**
	 * Define o valor do atributo <code>logradouro</code>.
	 *
	 * @param logradouro
	 */
	public void setLogradouro(final String logradouro) {

		this.logradouro = logradouro;
	}

	/**
	 * Retorna o valor do atributo <code>logradouroCurto</code>
	 *
	 * @return <code>String</code>
	 */
	public String getLogradouroCurto() {

		return this.logradouroCurto;
	}

	/**
	 * Define o valor do atributo <code>logradouroCurto</code>.
	 *
	 * @param logradouroCurto
	 */
	public void setLogradouroCurto(final String logradouroCurto) {

		this.logradouroCurto = logradouroCurto;
	}

}
