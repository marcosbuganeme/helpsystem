package br.com.helpsystem.negocio.impl;

import java.util.Collection;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import br.com.helpsystem.excecao.NegocioException;
import br.com.helpsystem.modelo.Usuario;
import br.com.helpsystem.negocio.UsuarioServiceFacade;
import br.com.helpsystem.persistencia.UsuarioDAO;
import br.com.helpsystem.utilitario.jpa.Transacao;

public class UsuarioService extends Service<Usuario> implements UsuarioServiceFacade {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -8321677086419378779L;

	/** Constante EMAIL_EXISTE. */
	private static final String EMAIL_EXISTE = "validacao.email.existe";

	/** Constante SENHA_INVALIDA. */
	private static final String SENHA_INVALIDA = "validacao.senha.invalida";

	@Inject
	private UsuarioDAO dao;

	@Override
	@Transacao
	public String salvar(final Usuario usuario) throws NegocioException {

		if (!this.senhaInvalida(usuario)) {

			throw new NegocioException(UsuarioService.SENHA_INVALIDA);
		}

		if (this.isEmailExiste(usuario)) {

			throw new NegocioException(UsuarioService.EMAIL_EXISTE);
		}

		return super.salvar(usuario);
	}

	@Override
	public boolean isEmailExiste(final Usuario usuario) {

		return this.getDAO().isEmailExiste(usuario.getEmail());
	}

	/**
	 * Método responsável por verificar se uma senha é ou não inválida.
	 *
	 * @author marcosbuganeme
	 *
	 * @param usuario
	 * 
	 * @return <i>True, caso a senha não seja compatível com a confirmação</i>.
	 */
	private boolean senhaInvalida(final Usuario usuario) {

		return StringUtils.equals(usuario.getSenha(), usuario.getConfirmaSenha());
	}

	public Collection<Usuario> listaPorNomeOuEmail(final String nome, final String email) {

		return this.getDAO().listaPorNomeOuEmail(nome, email);
	}

	@Override
	protected UsuarioDAO getDAO() {

		return this.dao;
	}

}
