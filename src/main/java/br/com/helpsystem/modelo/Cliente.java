package br.com.helpsystem.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.helpsystem.modelo.enuns.EnumTipoCliente;

public class Cliente extends EntidadeHelpSystem {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -3151380192524529953L;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pessoa")
	private EnumTipoCliente tipoCliente;

	private String nome;

	private String email;

	private String rg;

	private String cpf;

	private Date nascimento;

	private String sexo;

	private String razaoSocial;

	private String nomeFantasia;

	private String cpnj;

	private String inscricaoEstadual;

	private String siteInstitucional;

	private Endereco endereco;
}
