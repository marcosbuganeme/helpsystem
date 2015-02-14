package br.com.helpsystem.negocio;

import java.io.Serializable;
import java.util.Collection;

import br.com.helpsystem.excecao.NegocioException;
import br.com.helpsystem.modelo.Entidade;

public interface ServiceFacade<E extends Entidade> extends Serializable {

	/**
	 * Método responsável por retornar o registro pesquisado.
	 *
	 * @author marcosbuganeme
	 *
	 * @param id
	 * 
	 * @return <i>registro pesquisado</i>.
	 */
	E get(final Long id);

	/**
	 * Método responsável por salvar um determinado registro.
	 *
	 * @author marcosbuganeme
	 *
	 * @param entidade
	 *            - registro que será salvo.
	 * 
	 * @return <i>mensagem de salvo com sucesso</i>.
	 * 
	 * @throws NegocioException
	 */
	String salvar(final E entidade) throws NegocioException;

	/**
	 * Método responsável por mesclar um registro.
	 *
	 * @author marcosbuganeme
	 *
	 * @param entidade
	 * 
	 * @return <i>mensagem de mesclado com sucesso</i>.
	 * 
	 * @throws NegocioException
	 */
	String mesclar(final E entidade) throws NegocioException;

	/**
	 * Método responsável por atualizar um registro.
	 *
	 * @author marcosbuganeme
	 *
	 * @param entidade
	 * 
	 * @return <i>mensagem de atualizado com sucesso</i>.
	 */
	String atualizar(final E entidade);

	/**
	 * Método responsável por remover um registro.
	 *
	 * @author marcosbuganeme
	 *
	 * @param entidade
	 * 
	 * @return <i>mensagem de removido com sucesso</i>.
	 * 
	 * @throws NegocioException
	 */
	String remover(final E entidade) throws NegocioException;

	/**
	 * Método responsável por listar todos os registros de uma tabela.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>todos os registros da tabela</i>.
	 */
	Collection<E> listar();
}
