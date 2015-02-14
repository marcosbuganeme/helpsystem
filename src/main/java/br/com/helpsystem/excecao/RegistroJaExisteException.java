package br.com.helpsystem.excecao;

public class RegistroJaExisteException extends NegocioException {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 2255217970708129388L;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public RegistroJaExisteException() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 */
	public RegistroJaExisteException( final String mensagem ) {

		super(mensagem);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param causa
	 */
	public RegistroJaExisteException( final Throwable causa ) {

		super(causa);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 * 
	 * @param causa
	 */
	public RegistroJaExisteException( final String mensagem, final Throwable causa ) {

		super(mensagem, causa);
	}

}
