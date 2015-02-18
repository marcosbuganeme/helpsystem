package br.com.helpsystem.modelo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.helpsystem.modelo.enuns.EnumTipoCliente;

@Entity
@Table(name = "cliente")
public class Cliente extends EntidadeHelpSystem {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -3151380192524529953L;

	/** Atributo tipoCliente. */
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pessoa")
	private EnumTipoCliente tipoCliente;

	/** Atributo fisica. */
	@Embedded
	private PessoaFisica fisica;

	/** Atributo juridica. */
	@Embedded
	private PessoaJuridica juridica;

	/** Atributo endereco. */
	@OneToOne(mappedBy = "cliente")
	private Endereco endereco;

	/**
	 * Retorna o valor do atributo <code>tipoCliente</code>
	 *
	 * @return <code>EnumTipoCliente</code>
	 */
	public EnumTipoCliente getTipoCliente() {

		return tipoCliente;
	}

	/**
	 * Define o valor do atributo <code>tipoCliente</code>.
	 *
	 * @param tipoCliente
	 */
	public void setTipoCliente(EnumTipoCliente tipoCliente) {

		this.tipoCliente = tipoCliente;
	}

	/**
	 * Retorna o valor do atributo <code>fisica</code>
	 *
	 * @return <code>PessoaFisica</code>
	 */
	public PessoaFisica getFisica() {

		return fisica;
	}

	/**
	 * Define o valor do atributo <code>fisica</code>.
	 *
	 * @param fisica
	 */
	public void setFisica(PessoaFisica fisica) {

		this.fisica = fisica;
	}

	/**
	 * Retorna o valor do atributo <code>juridica</code>
	 *
	 * @return <code>PessoaJuridica</code>
	 */
	public PessoaJuridica getJuridica() {

		return juridica;
	}

	/**
	 * Define o valor do atributo <code>juridica</code>.
	 *
	 * @param juridica
	 */
	public void setJuridica(PessoaJuridica juridica) {

		this.juridica = juridica;
	}

	/**
	 * Retorna o valor do atributo <code>endereco</code>
	 *
	 * @return <code>Endereco</code>
	 */
	public Endereco getEndereco() {

		return endereco;
	}

	/**
	 * Define o valor do atributo <code>endereco</code>.
	 *
	 * @param endereco
	 */
	public void setEndereco(Endereco endereco) {

		this.endereco = endereco;
	}

}
