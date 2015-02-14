package br.com.helpsystem.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.helpsystem.controller.formulario.UsuarioFormulario;
import br.com.helpsystem.modelo.Usuario;
import br.com.helpsystem.negocio.UsuarioServiceFacade;

@Named
@ViewScoped
public class UsuarioController extends Controller<Usuario> {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -7918784908189852032L;

	/** Atributo formulario. */
	@Inject
	private UsuarioFormulario formulario;

	/** Atributo serviceFacade. */
	@Inject
	private UsuarioServiceFacade serviceFacade;

	@Override
	public UsuarioFormulario getFormulario() {

		return this.formulario;
	}

	@Override
	protected UsuarioServiceFacade getServiceFacade() {

		return this.serviceFacade;
	}

}
