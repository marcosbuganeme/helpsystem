package br.com.helpsystem.controller.formulario;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import br.com.helpsystem.modelo.Entidade;

public abstract class Formulario<E extends Entidade> implements Serializable {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 164157858803369789L;

	/** Atributo entidade. */
	private E entidade;

	/** Atributo consulta. */
	private E consulta;

	/** Atributo entidades. */
	private Collection<E> entidades;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public <T> Formulario() {

		try {

			this.entidade = this.getTipoEntidade().newInstance();

			this.consulta = this.getTipoEntidade().newInstance();

		} catch (Exception e) {

		}
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param clazz
	 */
	public Formulario( final Class<E> clazz ) {

		try {

			this.entidade = clazz.newInstance();

			this.consulta = clazz.newInstance();

		} catch (Exception e) {

		}
	}

	/**
	 * Método responsável por obter a entidade manipulada através de generics.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>entidade corrente</i>.
	 */
	@SuppressWarnings("unchecked")
	protected Class<E> getTipoEntidade() {

		final Type[] tipoEntidade = ( (ParameterizedType) this.getClass().getGenericSuperclass() ).getActualTypeArguments();

		return (Class<E>) tipoEntidade[0];
	}

	/**
	 * Retorna o valor do atributo <code>entidade</code>
	 *
	 * @return <code>E</code>
	 */
	public E getEntidade() {

		return entidade;
	}

	/**
	 * Define o valor do atributo <code>entidade</code>.
	 *
	 * @param entidade
	 */
	public void setEntidade(E entidade) {

		this.entidade = entidade;
	}

	/**
	 * Retorna o valor do atributo <code>consulta</code>
	 *
	 * @return <code>E</code>
	 */
	public E getConsulta() {

		return consulta;
	}

	/**
	 * Define o valor do atributo <code>consulta</code>.
	 *
	 * @param consulta
	 */
	public void setConsulta(E consulta) {

		this.consulta = consulta;
	}

	/**
	 * Retorna o valor do atributo <code>entidades</code>
	 *
	 * @return <code>Collection<E></code>
	 */
	public Collection<E> getEntidades() {

		return entidades;
	}

	/**
	 * Define o valor do atributo <code>entidades</code>.
	 *
	 * @param entidades
	 */
	public void setEntidades(Collection<E> entidades) {

		this.entidades = entidades;
	}

}
