package br.com.helpsystem.excecao;

public class RegistroNaoExisteException extends NegocioException {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -3276662898873280600L;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public RegistroNaoExisteException() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 */
	public RegistroNaoExisteException( final String mensagem ) {

		super(mensagem);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param causa
	 */
	public RegistroNaoExisteException( final Throwable causa ) {

		super(causa);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 * 
	 * @param causa
	 */
	public RegistroNaoExisteException( final String mensagem, final Throwable causa ) {

		super(mensagem, causa);
	}
}
