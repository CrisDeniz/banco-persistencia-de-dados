package br.com.alura.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import br.com.alura.classes.SalvaEConsultaDados;

public class SalvaDados implements ActionListener{
	
	private JTextField cpf;
	private JTextField nome;
	private JTextField senha;
	
	public SalvaDados(JTextField cpf, JTextField nome, JTextField senha) {
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String parsedCpf = cpf.getText();
		String parsedNome = nome.getText();
		int parsedSenha = Integer.parseInt(senha.getText());

		SalvaEConsultaDados reader = new SalvaEConsultaDados();
		
		reader.add(parsedCpf, parsedNome, parsedSenha);
		
	}

}
