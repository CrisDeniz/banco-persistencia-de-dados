package br.com.alura.classes;


import javax.swing.SwingUtilities;


import br.com.alura.gui.CadastroForm;


public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			CadastroForm form = new CadastroForm();
			form.setVisible(true);
		});
	
		
	}

}

