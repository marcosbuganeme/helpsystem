package br.com.helpsystem.controller;

import java.io.Serializable;
import java.util.Collection;
import java.util.ResourceBundle;

import javax.inject.Inject;

import br.com.helpsystem.controller.formulario.Formulario;
import br.com.helpsystem.excecao.NegocioException;
import br.com.helpsystem.modelo.Entidade;
import br.com.helpsystem.negocio.ServiceFacade;
import br.com.helpsystem.utilitario.jsf.MensagemJSF;

public abstract class Controller<E extends Entidade> implements Serializable {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 8372272732585506716L;

	/** Constante PATH_ARQUIVO_INTERNACIONALIZACAO. */
	private static final String PATH_ARQUIVO_INTERNACIONALIZACAO = "br.com.helpsystem.mensagens";

	/** Atributo msg. */
	@Inject
	private MensagemJSF msg;

	/**
	 * Método responsável por obter o <code>Formulario</code> da entidade manipulada.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>formulário da entidade manipulada</i>.
	 */
	public abstract Formulario<E> getFormulario();

	/**
	 * Método responsável por obter os métodos relacionados a serviço.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>serviço da entidade manipulada</i>.
	 */
	protected abstract ServiceFacade<E> getServiceFacade();

	/**
	 * Método responsável por salvar um registro.
	 *
	 * @author marcosbuganeme
	 */
	public void salvar() {

		try {

			final String msgSalvoSucesso = this.getServiceFacade().salvar(this.getFormulario().getEntidade());

			this.msg.info(msgSalvoSucesso);

		} catch (final NegocioException e) {

			final String mensagemExcecao = this.getMensagem(e.getMessage());

			this.msg.error(mensagemExcecao);
		}
	}

	/**
	 * Método responsável por mesclar um registro.
	 *
	 * @author marcosbuganeme
	 */
	public void mesclar() {

		try {

			final String msgMescladoSucesso = this.getServiceFacade().mesclar(this.getFormulario().getEntidade());

			msg.info(msgMescladoSucesso);

		} catch (final NegocioException e) {

			final String mensagemExcecao = this.getMensagem(e.getMessage());

			this.msg.error(mensagemExcecao);
		}
	}

	/**
	 * Método responsável por atualizar um registro.
	 *
	 * @author marcosbuganeme
	 */
	public void atualizar() {

		this.getServiceFacade().atualizar(this.getFormulario().getEntidade());
	}

	/**
	 * Método responsável por remover um registro.
	 *
	 * @author marcosbuganeme
	 */
	public void remover() {

		try {

			final String mensagemRemovido = this.getServiceFacade().remover(this.getFormulario().getEntidade());

			msg.info(mensagemRemovido);

		} catch (Exception e) {

			final String mensagemExcecao = this.getMensagem(e.getMessage());

			this.msg.error(mensagemExcecao);
		}
	}

	/**
	 * Método responsável por listar todos os registros.
	 *
	 * @author marcosbuganeme
	 */
	public void listar() {

		final Collection<E> colecaoRegistros = this.getServiceFacade().listar();

		this.getFormulario().setEntidades(colecaoRegistros);
	}

	/**
	 * Método responsável por obter o valor do arquivo de internacionalização através da chave da mensagem.
	 *
	 * @author marcosbuganeme
	 *
	 * @param chaveMensagem
	 * 
	 * @return <i>mensagem do path de internacionalização</i>.
	 */
	protected String getMensagem(final String chaveMensagem) {

		return this.getBundle().getString(chaveMensagem);
	}

	/**
	 * Método responsável por obter o bundle da aplicação.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>bundle da aplicação</i>.
	 */
	private ResourceBundle getBundle() {

		return ResourceBundle.getBundle(Controller.PATH_ARQUIVO_INTERNACIONALIZACAO);
	}
}
