package br.com.helpsystem.persistencia;

import java.io.Serializable;
import java.util.Collection;

import br.com.helpsystem.excecao.NegocioException;
import br.com.helpsystem.modelo.Entidade;

public interface DAO<E extends Entidade> extends Serializable {

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
	void salvar(final E entidade) throws NegocioException;

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
	void mesclar(final E entidade) throws NegocioException;

	/**
	 * Método responsável por atualizar um registro.
	 *
	 * @author marcosbuganeme
	 *
	 * @param entidade
	 * 
	 * @return <i>mensagem de atualizado com sucesso</i>.
	 */
	void atualizar(final E entidade);

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
	void remover(final E entidade) throws NegocioException;

	/**
	 * Método responsável por listar todos os registros de uma tabela.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>todos os registros da tabela</i>.
	 */
	Collection<E> listar();

}
