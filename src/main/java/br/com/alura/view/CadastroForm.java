package br.com.alura.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.alura.actions.SalvaDados;
import br.com.alura.actions.FechaCadastro;

public class CadastroForm extends JFrame{

	
	private static final long serialVersionUID = 1L;
	protected JLabel lblNome;
	protected JLabel lblCpf;
	protected JLabel lblSenha;
	protected JTextField tfdNome;
	protected JTextField tfdCpf;
	protected JTextField tfdSenha;
	protected JButton btnLogin;
	protected JButton btnCadastro;
	protected JPanel pnlButtons;
	protected JPanel pnlForm;
	
	public CadastroForm() {
		this.inicializar();
	}

	public void inicializar() {
		this.setTitle("Cadastro - MyBank");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
		this.getContentPane().add(getPnlButtons(), BorderLayout.PAGE_END);
		this.pack();
	}
	
	public JPanel getPnlButtons() {
		if (pnlButtons == null) {
			pnlButtons = new JPanel(new FlowLayout());
	
			btnCadastro = new JButton("Cadastrar");
			btnLogin = new JButton("Login");
			
			pnlButtons.add(btnLogin);
			pnlButtons.add(btnCadastro);
			
			btnCadastro.addActionListener(new SalvaDados(tfdCpf,tfdNome,tfdSenha));
			btnLogin.addActionListener(new FechaCadastro(this));
		}
		
		return pnlButtons;
		
	}


	public JPanel getPnlForm() {
		if (pnlForm == null) {
			pnlForm = new JPanel(new GridLayout(3, 2));
			
			lblNome = new JLabel("Nome:");
			lblCpf = new JLabel("CPF:");
			lblSenha = new JLabel("Senha:");
			
			tfdNome = new JTextField(15);
			tfdCpf = new JTextField(15);
			tfdSenha = new JTextField(15);
			
			pnlForm.add(lblNome);
			pnlForm.add(tfdNome);
			pnlForm.add(lblCpf);
			pnlForm.add(tfdCpf);
			pnlForm.add(lblSenha);
			pnlForm.add(tfdSenha);
		}
		
		return pnlForm;
	}
	
}
