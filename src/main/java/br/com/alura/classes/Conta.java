package br.com.alura.classes;

import java.util.Random;

public class Conta {
	
	private int saldo;
	private int agencia;
	private int numero;
	private int senha;
	private Titular titular;
	
	public Conta( String nome, String cpf, int senha) {
		this.agencia = 0001;
		this.numero = new Random().nextInt(123);
		this.titular = new Titular(nome , cpf);
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Nome:" + getTitular().getNome();
	}
	
	public Titular getTitular() {
		return titular;
	}
	
	
	public int getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public void depositar(int saldo) {
		this.saldo += saldo;
	}
	

	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		
		
		return this.getTitular().getCpf().equals(conta.getTitular().getCpf());
	
	}
	
	@Override
	public int hashCode() {
		return this.getTitular().getCpf().hashCode();
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	

}
