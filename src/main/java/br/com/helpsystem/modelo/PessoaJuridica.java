package br.com.helpsystem.modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PessoaJuridica {

	/** Atributo razaoSocial. */
	@Column(name = "razao_social")
	private String razaoSocial;

	/** Atributo nomeFantasia. */
	@Column(name = "nome_fantasia")
	private String nomeFantasia;

	/** Atributo cpnj. */
	private String cnpj;

	/** Atributo inscricaoEstadual. */
	@Column(name = "inscricao_estadual")
	private String inscricaoEstadual;

	/** Atributo siteInstitucional. */
	@Column(name = "site_institucional")
	private String siteInstitucional;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public PessoaJuridica() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param razaoSocial
	 * 
	 * @param nomeFantasia
	 * 
	 * @param cnpj
	 * 
	 * @param inscricaoEstadual
	 * 
	 * @param siteInstitucional
	 */
	public PessoaJuridica( final String razaoSocial, final String nomeFantasia, final String cnpj, final String inscricaoEstadual, final String siteInstitucional ) {

		this.razaoSocial = razaoSocial;

		this.nomeFantasia = nomeFantasia;

		this.cnpj = cnpj;

		this.inscricaoEstadual = inscricaoEstadual;

		this.siteInstitucional = siteInstitucional;
	}

	/**
	 * Retorna o valor do atributo <code>razaoSocial</code>
	 *
	 * @return <code>String</code>
	 */
	public String getRazaoSocial() {

		return this.razaoSocial;
	}

	/**
	 * Define o valor do atributo <code>razaoSocial</code>.
	 *
	 * @param razaoSocial
	 */
	public void setRazaoSocial(final String razaoSocial) {

		this.razaoSocial = razaoSocial;
	}

	/**
	 * Retorna o valor do atributo <code>nomeFantasia</code>
	 *
	 * @return <code>String</code>
	 */
	public String getNomeFantasia() {

		return this.nomeFantasia;
	}

	/**
	 * Define o valor do atributo <code>nomeFantasia</code>.
	 *
	 * @param nomeFantasia
	 */
	public void setNomeFantasia(final String nomeFantasia) {

		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * Retorna o valor do atributo <code>cnpj</code>
	 *
	 * @return <code>String</code>
	 */
	public String getCnpj() {

		return this.cnpj;
	}

	/**
	 * Define o valor do atributo <code>cnpj</code>.
	 *
	 * @param cnpj
	 */
	public void setCnpj(final String cnpj) {

		this.cnpj = cnpj;
	}

	/**
	 * Retorna o valor do atributo <code>inscricaoEstadual</code>
	 *
	 * @return <code>String</code>
	 */
	public String getInscricaoEstadual() {

		return this.inscricaoEstadual;
	}

	/**
	 * Define o valor do atributo <code>inscricaoEstadual</code>.
	 *
	 * @param inscricaoEstadual
	 */
	public void setInscricaoEstadual(final String inscricaoEstadual) {

		this.inscricaoEstadual = inscricaoEstadual;
	}

	/**
	 * Retorna o valor do atributo <code>siteInstitucional</code>
	 *
	 * @return <code>String</code>
	 */
	public String getSiteInstitucional() {

		return this.siteInstitucional;
	}

	/**
	 * Define o valor do atributo <code>siteInstitucional</code>.
	 *
	 * @param siteInstitucional
	 */
	public void setSiteInstitucional(final String siteInstitucional) {

		this.siteInstitucional = siteInstitucional;
	}

}
