package br.com.helpsystem.negocio;

import java.util.Collection;

import br.com.helpsystem.modelo.Usuario;

public interface UsuarioServiceFacade extends ServiceFacade<Usuario> {

	/**
	 * Método responsável por verificar se um e-mail já existe.
	 *
	 * @author marcosbuganeme
	 *
	 * @param usuario
	 * 
	 * @return <i>True, e-mail já existe</i>.
	 */
	boolean isEmailExiste(final Usuario usuario);

	/**
	 * Método responsável por pesquisar por usuários através do nome e/ou email.
	 *
	 * @author marcosbuganeme
	 *
	 * @param nome
	 * 
	 * @param email
	 * 
	 * @return <i>dados da consulta do usuário</i>.
	 */
	Collection<Usuario> listaPorNomeOuEmail(final String nome, final String email);
}
