package br.com.alura.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import br.com.alura.view.LoginForm;

public class FechaCadastro implements ActionListener{
	
	private final JFrame frame;
	
	public FechaCadastro(JFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame loginJanela = new LoginForm();
		frame.dispose();
		loginJanela.setVisible(true);
	}

}
