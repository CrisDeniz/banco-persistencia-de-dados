package br.com.alura.classes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.conta.Conta;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SalvaEConsultaDados {
	

	public static List<Conta> contas = new ArrayList<>();
	
	
	public void add(String cpf, String nome, int senha) {
		
		contas.add(new Conta(nome, cpf, senha));
		verifica();
	}
	
	public void verifica() {
		
		Gson builder = new GsonBuilder().setPrettyPrinting().create();
		
		String gson = builder.toJson(contas);
		
		File arquivo = new File(new DataPath().getPath());
		
		VerificaConteudo conteudo = new ExisteConteudo( new NaoExisteConteudo(null));
		
		conteudo.verifique(arquivo, gson, contas);
	}
	
}
