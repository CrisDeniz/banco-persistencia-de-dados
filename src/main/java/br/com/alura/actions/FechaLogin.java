package br.com.alura.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import br.com.alura.view.CadastroForm;

public class FechaLogin implements ActionListener{

private final JFrame frame;
	
	public FechaLogin(JFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame cadastroJanela = new CadastroForm();
		frame.dispose();
		cadastroJanela.setVisible(true);
	}


}
