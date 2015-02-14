package br.com.helpsystem.excecao;

public class NegocioException extends RuntimeException {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 4165230863650071750L;

	public NegocioException() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 */
	public NegocioException( final String mensagem ) {

		super(mensagem);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param causa
	 */
	public NegocioException( final Throwable causa ) {

		super(causa);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 * 
	 * @param causa
	 */
	public NegocioException( final String mensagem, final Throwable causa ) {

		super(mensagem, causa);
	}
}
