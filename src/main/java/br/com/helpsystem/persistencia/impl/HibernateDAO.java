package br.com.helpsystem.persistencia.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.helpsystem.excecao.NegocioException;
import br.com.helpsystem.modelo.Entidade;
import br.com.helpsystem.persistencia.DAO;

@SuppressWarnings("unchecked")
public class HibernateDAO<E extends Entidade> implements DAO<E> {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 6485169587008678392L;

	/** Atributo manager. */
	private EntityManager manager;

	@Override
	public E get(Long id) {

		final Class<E> entidadePersistente = this.getTipoEntidade();

		return this.getManager().find(entidadePersistente, id);
	}

	private Class<E> getTipoEntidade() {

		final Type[] tipoEntidade = ( (ParameterizedType) this.getClass().getGenericSuperclass() ).getActualTypeArguments();

		return (Class<E>) tipoEntidade[0];
	}

	@Override
	public void salvar(E entidade) throws NegocioException {

		this.getManager().persist(entidade);
	}

	@Override
	public void mesclar(E entidade) throws NegocioException {

		this.getManager().merge(entidade);
	}

	@Override
	public void atualizar(E entidade) {

		this.getManager().refresh(entidade);
	}

	@Override
	public void remover(E entidade) throws NegocioException {

		this.getManager().remove(entidade);
	}

	@Override
	public Collection<E> listar() {

		final Criteria criteria = this.getCriteria();

		return criteria.list();
	}

	/**
	 * Método responsável por obter o criteria da entidade manipulada através de generics.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>objeto criteria da entidade manipulada</i>.
	 */
	private Criteria getCriteria() {

		final Class<E> tipoEntidade = this.getTipoEntidade();

		return this.getSession().createCriteria(tipoEntidade);
	}

	/**
	 * Retorna o valor do atributo <code>manager</code>
	 *
	 * @return <code>EntityManager</code>
	 */
	public EntityManager getManager() {

		return this.manager;
	}

	/**
	 * Retorna o valor do atributo <code>manager</code>
	 *
	 * @return <code>Session</code>
	 */
	protected Session getSession() {

		return this.getManager().unwrap(Session.class);
	}

}
