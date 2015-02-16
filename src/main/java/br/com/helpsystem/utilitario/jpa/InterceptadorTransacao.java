package br.com.helpsystem.utilitario.jpa;

import java.io.Serializable;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Interceptor
@Transacao
@Priority(Interceptor.Priority.APPLICATION + 1)
public class InterceptadorTransacao implements Serializable {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -6059304191442082395L;

	/** Atributo manager. */
	@Inject
	private EntityManager entityManager;

	@AroundInvoke
	public Object invoke(final InvocationContext context) throws Exception {

		final EntityTransaction entidadeTransacional = this.entityManager.getTransaction();

		boolean criador = false;

		try {

			if (!entidadeTransacional.isActive()) {

				entidadeTransacional.begin();

				entidadeTransacional.rollback();

				entidadeTransacional.begin();

				criador = true;
			}

			return context.proceed();

		} catch (final Exception excecao) {

			if (entidadeTransacional != null && criador) {

				entidadeTransacional.rollback();
			}

			throw excecao;

		} finally {

			if (entidadeTransacional != null && entidadeTransacional.isActive() && criador) {

				entidadeTransacional.commit();
			}
		}
	}

}
