package br.com.helpsystem.modelo;

import java.io.Serializable;

public interface Entidade extends Serializable {

	/**
	 * Método responsável por obter o identificador da entidade.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>identificador</i>.
	 */
	Long getId();

	/**
	 * Método responsável por verificar se um objeto foi ou não persistido na base de dados.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>True, foi persistido.</i>
	 */
	boolean isNovoRegistro();
}
