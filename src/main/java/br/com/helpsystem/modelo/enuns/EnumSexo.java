package br.com.helpsystem.modelo.enuns;

public enum EnumSexo {

	/** Constante FEMININO. */
	FEMININO(1, "feminino"),

	/** Constante MASCULINO. */
	MASCULINO(2, "masculino");

	/** Atributo codigo. */
	private int codigo;

	/** Atributo descricao. */
	private String descricao;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	private EnumSexo() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param codigo
	 * 
	 * @param descricao
	 */
	private EnumSexo( final int codigo, final String descricao ) {

		this.codigo = codigo;

		this.descricao = descricao;
	}

	/**
	 * Retorna o valor do atributo <code>codigo</code>
	 *
	 * @return <code>int</code>
	 */
	public int getCodigo() {

		return codigo;
	}

	/**
	 * Retorna o valor do atributo <code>descricao</code>
	 *
	 * @return <code>String</code>
	 */
	public String getDescricao() {

		return descricao;
	}

}
