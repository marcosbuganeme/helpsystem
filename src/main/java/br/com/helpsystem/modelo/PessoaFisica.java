package br.com.helpsystem.modelo;

import java.util.Date;

import javax.persistence.Embeddable;

import br.com.helpsystem.modelo.enuns.EnumSexo;

@Embeddable
public class PessoaFisica {

	/** Atributo nome. */
	private String nome;

	/** Atributo email. */
	private String email;

	/** Atributo rg. */
	private String rg;

	/** Atributo cpf. */
	private String cpf;

	/** Atributo nascimento. */
	private Date nascimento;

	/** Atributo sexo. */
	private EnumSexo sexo;

	public PessoaFisica() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param nome
	 * 
	 * @param email
	 * 
	 * @param rg
	 * 
	 * @param cpf
	 * 
	 * @param nascimento
	 * 
	 * @param sexo
	 */
	public PessoaFisica( final String nome, final String email, final String rg, final String cpf, final Date nascimento, final EnumSexo sexo ) {

		this.nome = nome;

		this.email = email;

		this.rg = rg;

		this.cpf = cpf;

		this.nascimento = nascimento;

		this.sexo = sexo;
	}

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
	 * Retorna o valor do atributo <code>rg</code>
	 *
	 * @return <code>String</code>
	 */
	public String getRg() {

		return rg;
	}

	/**
	 * Define o valor do atributo <code>rg</code>.
	 *
	 * @param rg
	 */
	public void setRg(String rg) {

		this.rg = rg;
	}

	/**
	 * Retorna o valor do atributo <code>cpf</code>
	 *
	 * @return <code>String</code>
	 */
	public String getCpf() {

		return cpf;
	}

	/**
	 * Define o valor do atributo <code>cpf</code>.
	 *
	 * @param cpf
	 */
	public void setCpf(String cpf) {

		this.cpf = cpf;
	}

	/**
	 * Retorna o valor do atributo <code>nascimento</code>
	 *
	 * @return <code>Date</code>
	 */
	public Date getNascimento() {

		return nascimento;
	}

	/**
	 * Define o valor do atributo <code>nascimento</code>.
	 *
	 * @param nascimento
	 */
	public void setNascimento(Date nascimento) {

		this.nascimento = nascimento;
	}

	/**
	 * Retorna o valor do atributo <code>sexo</code>
	 *
	 * @return <code>EnumSexo</code>
	 */
	public EnumSexo getSexo() {

		return sexo;
	}

	/**
	 * Define o valor do atributo <code>sexo</code>.
	 *
	 * @param sexo
	 */
	public void setSexo(EnumSexo sexo) {

		this.sexo = sexo;
	}

}
