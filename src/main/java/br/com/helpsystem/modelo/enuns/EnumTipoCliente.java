package br.com.helpsystem.modelo.enuns;

public enum EnumTipoCliente {

	/** Constante PESSOA_FISICA. */
	PESSOA_FISICA(1, "pessoa física"),

	/** Constante PESSOA_JURIDICA. */
	PESSOA_JURIDICA(2, "pessoa juridica");

	/** Atributo codigo. */
	private int codigo;

	/** Atributo descricao. */
	private String descricao;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	private EnumTipoCliente() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param codigo
	 * 
	 * @param descricao
	 */
	private EnumTipoCliente( final int codigo, final String descricao ) {

		this.codigo = codigo;

		this.descricao = descricao;
	}

	/**
	 * Retorna o valor do atributo <code>codigo</code>
	 *
	 * @return <code>int</code>
	 */
	public int getCodigo() {

		return this.codigo;
	}

	/**
	 * Retorna o valor do atributo <code>descricao</code>
	 *
	 * @return <code>String</code>
	 */
	public String getDescricao() {

		return this.descricao;
	}

}
