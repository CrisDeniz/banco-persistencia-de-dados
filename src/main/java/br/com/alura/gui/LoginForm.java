package br.com.alura.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.alura.actions.FazerLogin;
import br.com.alura.actions.FechaLogin;


public class LoginForm extends JFrame{

	private static final long serialVersionUID = 1L;
	protected JLabel lblCpf;
	protected JLabel lblSenha;
	protected JTextField tfdCpf;
	protected JTextField tfdSenha;
	protected JButton btnLogin;
	protected JButton btnCadastro;
	protected JPanel pnlButtons;
	protected JPanel pnlForm;
	
	public LoginForm() {
		this.inicializar();
	}

	public void inicializar() {
		this.setTitle("Cadastro - MyBank");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
		this.getContentPane().add(getPnlButtons(), BorderLayout.PAGE_END);
		this.pack();
		
		
		btnCadastro.addActionListener(new FechaLogin(this));
		btnLogin.addActionListener(new FazerLogin(tfdCpf, tfdSenha));
	}
	
	public JPanel getPnlButtons() {
		if (pnlButtons == null) {
			pnlButtons = new JPanel(new FlowLayout());
	
			btnCadastro = new JButton("Cadastrar");
			btnLogin = new JButton("Login");
			
			pnlButtons.add(btnLogin);
			pnlButtons.add(btnCadastro);

		}
		
		return pnlButtons;
		
	}


	public JPanel getPnlForm() {
		if (pnlForm == null) {
			pnlForm = new JPanel(new GridLayout(3, 2));
			
			lblCpf = new JLabel("CPF:");
			lblSenha = new JLabel("Senha:");
			
			tfdCpf = new JTextField(15);
			tfdSenha = new JTextField(15);

			pnlForm.add(lblCpf);
			pnlForm.add(tfdCpf);
			pnlForm.add(lblSenha);
			pnlForm.add(tfdSenha);
		}
		
		return pnlForm;
	}
	
}



