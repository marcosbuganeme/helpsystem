package br.com.helpsystem.modelo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.helpsystem.modelo.enuns.EnumTipoCliente;

@Entity
public class Cliente extends EntidadeHelpSystem {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -3151380192524529953L;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pessoa")
	private EnumTipoCliente tipoCliente;

	/** Atributo fisica. */
	@Embedded
	private PessoaFisica fisica;

	/** Atributo juridica. */
	@Embedded
	private PessoaJuridica juridica;

	private Endereco endereco;
}
