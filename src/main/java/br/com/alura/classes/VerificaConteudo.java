package br.com.alura.classes;

import br.com.alura.conta.Conta;

import java.io.File;
import java.util.List;


public abstract class VerificaConteudo {

	private VerificaConteudo proximo;
	
	public VerificaConteudo(VerificaConteudo proximo) {
		this.proximo = proximo;
	}
	
	public void verifique(File arquivo, String gson, List<Conta> contas) {
		if(deveExecutar(arquivo)) {
			verificar(gson, contas);
		}
		proximo.verificar(gson, contas);
		
	}
	
	public abstract void verificar(String gson, List<Conta> contas);
	public abstract boolean deveExecutar(File arquivo);
	
}
