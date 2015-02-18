package br.com.helpsystem.negocio.impl;

import javax.inject.Inject;

import br.com.helpsystem.modelo.Cliente;
import br.com.helpsystem.negocio.ClienteServiceFacade;
import br.com.helpsystem.persistencia.ClienteDAO;

public class ClienteService extends Service<Cliente> implements ClienteServiceFacade {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -116732605690315061L;

	/** Atributo dao. */
	@Inject
	private ClienteDAO dao;

	@Override
	protected ClienteDAO getDAO() {

		return this.dao;
	}

}
