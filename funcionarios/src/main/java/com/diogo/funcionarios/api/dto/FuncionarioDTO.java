package com.diogo.funcionarios.api.dto;

public class FuncionarioDTO {
	
	private long id;
	private String nome;
	private String sobrenome;
	private String email;
	private int numeroNis;
	
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
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumeroNis() {
		return numeroNis;
	}
	
	public void setNumeroNis(int numeroNis) {
		this.numeroNis = numeroNis;
	}
}
