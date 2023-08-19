package br.com.alura.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.classes.Conta;

public class Login {

	private static List<Conta> contas = new ArrayList<Conta>();
	private int senha;
	private String cpf;
	
	public Login(int senha, String cpf) {
		this.senha = senha;
		this.cpf = cpf;
	}
	
	
	public void fazLogin() {
		
		Gson builder = new GsonBuilder().setPrettyPrinting().create();
		
		Path filePath = Path.of("C:\\Users\\Cristian\\eclipse-projetos-pessoais\\banco\\src\\main\\resources\\data.json");

		System.out.println(this.cpf);
		System.out.println(this.senha);
		
		try {
			String content = Files.readString(filePath);
			
			Conta[] contaArray = builder.fromJson(content, Conta[].class); 
			
			for (Conta conta : contaArray) {
				contas.add(conta);
				
			}
			
			contas.contains(contaArray)
			
			contas.forEach(conta -> {
				
				if(conta.getSenha() == this.senha && conta.getTitular().getCpf().equals(this.cpf)) {
					JOptionPane.showMessageDialog(null, "Bem vindo " + conta.getTitular().getNome());
					
				} else if(conta.getSenha() != this.senha && conta.getTitular().getCpf() != this.cpf) {
					JOptionPane.showMessageDialog(null, "CPF ou Senha invalidos");
				}
				
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
}
