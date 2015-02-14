package br.com.helpsystem.persistencia.impl;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.helpsystem.modelo.Usuario;
import br.com.helpsystem.persistencia.UsuarioDAO;

public class UsuarioHibernateDAO extends HibernateDAO<Usuario> implements UsuarioDAO {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 5273031459733191284L;

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
