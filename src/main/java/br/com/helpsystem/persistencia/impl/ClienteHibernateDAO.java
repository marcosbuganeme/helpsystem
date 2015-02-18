package br.com.helpsystem.persistencia.impl;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.helpsystem.modelo.Cliente;
import br.com.helpsystem.persistencia.ClienteDAO;

public class ClienteHibernateDAO extends HibernateDAO<Cliente> implements ClienteDAO {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -5251670297564396535L;

	/** Atributo manager. */
	@Inject
	private EntityManager manager;

	/**
	 * Retorna o valor do atributo <code>manager</code>
	 *
	 * @return <code>EntityManager</code>
	 */
	public EntityManager getManager() {

		return manager;
	}

}
