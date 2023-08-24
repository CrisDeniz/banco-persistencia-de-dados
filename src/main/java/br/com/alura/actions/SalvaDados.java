package br.com.alura.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import br.com.alura.classes.SalvaEConsultaDados;

public class SalvaDados implements ActionListener{
	
	private final JTextField cpf;
	private final JTextField nome;
	private final JTextField senha;
	
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

		SalvaEConsultaDados salvaEConsulta = new SalvaEConsultaDados();
		
		salvaEConsulta.add(parsedCpf, parsedNome, parsedSenha);
		
	}

}
