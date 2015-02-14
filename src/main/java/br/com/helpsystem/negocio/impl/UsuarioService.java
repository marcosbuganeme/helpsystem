package br.com.helpsystem.negocio.impl;

import javax.inject.Inject;

import br.com.helpsystem.modelo.Usuario;
import br.com.helpsystem.negocio.UsuarioServiceFacade;
import br.com.helpsystem.persistencia.DAO;
import br.com.helpsystem.persistencia.UsuarioDAO;

public class UsuarioService extends Service<Usuario> implements UsuarioServiceFacade {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -8321677086419378779L;

	@Inject
	private UsuarioDAO dao;
	
	@Override
	protected DAO<Usuario> getDAO() {

		return this.dao;
	}

}
