package br.com.helpsystem.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.helpsystem.controller.formulario.UsuarioFormulario;
import br.com.helpsystem.modelo.Usuario;
import br.com.helpsystem.negocio.UsuarioServiceFacade;
import br.com.helpsystem.utilitario.jsf.MensagemJSF;

@Named
@ViewScoped
public class UsuarioController extends Controller<Usuario> {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -7918784908189852032L;

	/** Constante PESQUISA_VAZIA. */
	private static final String PESQUISA_VAZIA = "pesquisa.vazia";

	/** Atributo formulario. */
	@Inject
	private UsuarioFormulario formulario;

	/** Atributo serviceFacade. */
	@Inject
	private UsuarioServiceFacade serviceFacade;

	/** Atributo msg. */
	@Inject
	private MensagemJSF msg;

	public void pesquisar() {

		this.getFormulario().setEntidades(this.getServiceFacade().listaPorNomeOuEmail(this.getFormulario().getNome(), this.getFormulario().getEmail()));

		if (this.getFormulario().getEntidades().size() == 0) {

			this.msg.warn(this.getMensagem(UsuarioController.PESQUISA_VAZIA));
		}
	}

	@Override
	public void limparDados() {

		this.getFormulario().setNome(null);

		this.getFormulario().setEmail(null);

		this.getFormulario().setEntidades(new ArrayList<Usuario>(0));
	}

	@PostConstruct
	protected void iniciarDados() {

		this.getFormulario().setEntidade(new Usuario());
	}

	@Override
	public UsuarioFormulario getFormulario() {

		return this.formulario;
	}

	@Override
	protected UsuarioServiceFacade getServiceFacade() {

		return this.serviceFacade;
	}

}
