package br.com.helpsystem.negocio.impl;

import java.util.Collection;

import br.com.helpsystem.excecao.NegocioException;
import br.com.helpsystem.excecao.RegistroNaoExisteException;
import br.com.helpsystem.modelo.Entidade;
import br.com.helpsystem.negocio.ServiceFacade;
import br.com.helpsystem.persistencia.DAO;

public abstract class Service<E extends Entidade> implements ServiceFacade<E> {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -4294253795529900215L;

	/** Constante MSG_SALVAR. */
	private static final String MSG_SALVAR = "registro.salvo";

	/** Constante MSG_MESCLAR. */
	private static final String MSG_MESCLAR = "registro.mesclado";

	/** Constante MSG_ATUALIZAR. */
	private static final String MSG_ATUALIZAR = "registro.atualizado";

	/** Constante MSG_REMOVER. */
	private static final String MSG_REMOVER = "registro.removido";

	private static final String MSG_REGISTRO_NAO_EXISTE = "registro.nao.existe";

	/**
	 * Método responsável por obter o <code>DAO</code> da entidade manipulada.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>dao da entidade manipulada</i>.
	 */
	protected abstract DAO<E> getDAO();

	@Override
	public E get(final Long id) {

		return this.getDAO().get(id);
	}

	@Override
	public String salvar(final E entidade) throws NegocioException {

		this.getDAO().salvar(entidade);

		return Service.MSG_SALVAR;
	}

	@Override
	public String mesclar(final E entidade) throws NegocioException {

		this.getDAO().mesclar(entidade);

		return Service.MSG_MESCLAR;
	}

	@Override
	public String atualizar(final E entidade) {

		this.getDAO().atualizar(entidade);

		return Service.MSG_ATUALIZAR;
	}

	@Override
	public String remover(final E entidade) throws NegocioException {

		if (entidade == null) {

			throw new RegistroNaoExisteException(Service.MSG_REGISTRO_NAO_EXISTE);
		}

		final E entidadePesquisada = this.getDAO().get(entidade.getId());

		this.getDAO().remover(entidadePesquisada);

		return Service.MSG_REMOVER;
	}

	@Override
	public Collection<E> listar() {

		return this.getDAO().listar();
	}

}
