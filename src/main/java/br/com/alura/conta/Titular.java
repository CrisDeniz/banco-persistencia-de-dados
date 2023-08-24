package br.com.alura.conta;

public class Titular {
	
	private final String nome;
	private final String cpf;
	
	public Titular(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	

}
