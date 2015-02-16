package br.com.helpsystem.persistencia;

import java.util.Collection;

import br.com.helpsystem.modelo.Usuario;

public interface UsuarioDAO extends DAO<Usuario> {

	boolean isEmailExiste(final String email);

	Collection<Usuario> listaPorNomeOuEmail(final String nome, final String email);
}
