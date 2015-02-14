package br.com.helpsystem.utilitario.jsf;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class MensagemJSF implements Serializable {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 3605559236988502001L;

	/**
	 * Método responsável por exibir mensagem na tela.
	 *
	 * @author marcosbuganeme
	 *
	 * @param mensagem
	 * 
	 * @param severidade
	 */
	private void exibirMensagem(final String mensagem, final Severity severidade) {

		FacesContext contexto = FacesContext.getCurrentInstance();

		FacesMessage msg = new FacesMessage(mensagem);

		msg.setSeverity(severidade);

		contexto.addMessage(null, msg);

	}

	/**
	 * Método responsável por exibir uma mensagem de informação.
	 *
	 * @author marcosbuganeme
	 *
	 * @param mensagem
	 */
	public void info(final String mensagem) {

		this.exibirMensagem(mensagem, FacesMessage.SEVERITY_INFO);
	}

	/**
	 * Método responsável por exibir uma mensagem de alerta.
	 *
	 * @author marcosbuganeme
	 *
	 * @param mensagem
	 */
	public void warn(final String mensagem) {

		this.exibirMensagem(mensagem, FacesMessage.SEVERITY_WARN);
	}

	/**
	 * Método responsável por exibir uma mensagem de erro.
	 *
	 * @author marcosbuganeme
	 *
	 * @param mensagem
	 */
	public void error(final String mensagem) {

		this.exibirMensagem(mensagem, FacesMessage.SEVERITY_ERROR);
	}
}
