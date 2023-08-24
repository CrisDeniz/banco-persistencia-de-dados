package br.com.alura;


import javax.swing.SwingUtilities;


import br.com.alura.view.CadastroForm;


public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			CadastroForm form = new CadastroForm();
			form.setVisible(true);
		});
	
		
	}

}

