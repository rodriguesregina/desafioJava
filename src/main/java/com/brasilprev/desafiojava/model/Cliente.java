package com.brasilprev.desafiojava.model;

/* author Regina Rodrigues*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_meusclientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 50, message = "São permitidos de 5 á 100 caracteres")
	private String nome;
	
	@NotNull(message = "O atributo endereço é obrigatório!")
	@Size(min = 5, max = 100, message = "O endereço deve conter de 5 á 100 caracteres")
	private String endereco;
	
	@NotNull(message = "O atributo CPF é obrigatório")
	@Size(min = 3, max = 11, message = "Os 11 digitos do CPF são obrigatórios!")
	private String cpf;
	
	
	/* Inserir os Getters and Setters*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

	
	

}

