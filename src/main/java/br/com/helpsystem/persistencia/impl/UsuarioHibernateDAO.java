package br.com.helpsystem.persistencia.impl;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.helpsystem.modelo.Usuario;
import br.com.helpsystem.persistencia.UsuarioDAO;

@SuppressWarnings("unchecked")
public class UsuarioHibernateDAO extends HibernateDAO<Usuario> implements UsuarioDAO {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 5273031459733191284L;

	@Inject
	private EntityManager manager;

	@Override
	public boolean isEmailExiste(final String email) {

		final Criteria criteria = this.getCriteria();

		criteria.add(Restrictions.eq("email", email));

		return criteria.list().size() > 0;
	}

	@Override
	public Collection<Usuario> listaPorNomeOuEmail(final String nome, final String email) {

		final Criteria criteria = this.getCriteria();

		if (StringUtils.isNotBlank(nome)) {

			criteria.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
		}

		if (StringUtils.isNotBlank(email)) {

			criteria.add(Restrictions.like("email", email, MatchMode.START));
		}

		return criteria.list();
	}

	/**
	 * Retorna o valor do atributo <code>manager</code>
	 *
	 * @return <code>EntityManager</code>
	 */
	@Override
	protected EntityManager getManager() {

		return this.manager;
	}

}
