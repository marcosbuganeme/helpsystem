package br.com.helpsystem.modelo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class EntidadeHelpSystem implements Entidade {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -4113789376207133019L;

	/** Atributo id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Atributo cadastro. */
	@Temporal(TemporalType.DATE)
	private Date cadastro;

	/** Atributo modificacao. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacao;

	@PrePersist
	@PreUpdate
	private void preencheDatas() {

		if (this.cadastro == null) {

			this.cadastro = new Date();
		}

		this.modificacao = new Date();
	}

	@Override
	public Long getId() {

		return this.id;
	}

	@Override
	public boolean isNovoRegistro() {

		return this.getId() == null;
	}

	/**
	 * Retorna o valor do atributo <code>cadastro</code>
	 *
	 * @return <code>Date</code>
	 */
	public Date getCadastro() {

		return this.cadastro;
	}

	/**
	 * Retorna o valor do atributo <code>modificacao</code>
	 *
	 * @return <code>Date</code>
	 */
	public Date getModificacao() {

		return this.modificacao;
	}

	@Override
	public int hashCode() {

		final int prime = 31;

		int result = 1;

		result = prime * result + ( ( this.id == null ) ? 0 : this.id.hashCode() );

		return result;
	}

	@Override
	public boolean equals(final Object obj) {

		if (this == obj) {

			return true;
		}

		if (obj == null) {

			return false;
		}

		if (!( obj instanceof EntidadeHelpSystem )) {

			return false;
		}

		final EntidadeHelpSystem other = (EntidadeHelpSystem) obj;

		if (this.id == null) {

			if (other.id != null) {

				return false;
			}

		} else if (!this.id.equals(other.id)) {

			return false;
		}

		return true;
	}

}
