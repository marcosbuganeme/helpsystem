package br.com.helpsystem.utilitario.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class FabricaEntityManager {

	/** Constante NOME_UNIDADE_PERSISTENCIA. */
	private static final String NOME_UNIDADE_PERSISTENCIA = "helpsystemPU";

	/** Atributo managerFactory. */
	private EntityManagerFactory managerFactory;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public FabricaEntityManager() {

		this.managerFactory = Persistence.createEntityManagerFactory(FabricaEntityManager.NOME_UNIDADE_PERSISTENCIA);
	}

	/**
	 * Método responsável por criar uma instância do contexto <code>EntityManager</code>.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>instância de entityManager</i>.
	 */
	@Produces
	@RequestScoped
	public EntityManager criar() {

		return this.managerFactory.createEntityManager();
	}

	public void fechar(@Disposes final EntityManager manager) {

		manager.close();
	}
}
