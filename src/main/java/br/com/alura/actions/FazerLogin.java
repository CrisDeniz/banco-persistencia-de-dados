package br.com.alura.actions;

import br.com.alura.classes.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class FazerLogin implements ActionListener{
	
	private final JTextField cpf;
	private final JTextField senha;

	
	public FazerLogin(JTextField cpf, JTextField senha) {
		this.cpf = cpf;
		this.senha = senha;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String parsedCpf = cpf.getText();
		int parsedSenha = Integer.parseInt(senha.getText());
		
		Login login = new Login(parsedSenha, parsedCpf);
		
		login.fazLogin();
		
	}

}
