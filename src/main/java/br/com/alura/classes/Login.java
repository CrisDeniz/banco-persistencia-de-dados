package br.com.alura.classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.conta.Conta;

public class Login {

	private static List<Conta> contas = new ArrayList<>();
	private final int senha;
	private final String cpf;

	private Conta conta;
	
	public Login(int senha, String cpf) {
		this.senha = senha;
		this.cpf = cpf;
	}
	
	
	public void fazLogin() {
		
		Gson builder = new GsonBuilder().setPrettyPrinting().create();
		
		Path filePath = Path.of(new DataPath().getPath());


		try {
			String content = Files.readString(filePath);
			
			Conta[] contaArray = builder.fromJson(content, Conta[].class);

			contas.addAll(Arrays.asList(contaArray));

			contas.forEach(conta -> {
				
				if(conta.getSenha() == this.senha && conta.getTitular().getCpf().equals(this.cpf)) {
					this.conta = conta;
				}
				
			});

			if (this.conta != null) {
				JOptionPane.showMessageDialog(null, "Bem vindo " + this.conta.getTitular().getNome());
			} else {
				JOptionPane.showMessageDialog(null, "CPF ou Senha invalidos");
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		
		
	}
	
}
