package util;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import frases.ViewFrases;

public class Login {
	
	public static JTextField txtUsuario;
	public static JPasswordField txtSenha;
	
	public static void Login() {
		ViewFrases window = new ViewFrases();
		Frames.frameLogin.setVisible(true);

		JLabel Hora = new JLabel(Horario.BoasVindas());
		Hora.setBounds(37, 3, 435, 67);
		Hora.setFont(new Font("Rockwell", Font.BOLD, 15));
		Hora.setVisible(true);
		JLabel Login = new JLabel(
				"Bem vindo ao programa gerador de frases! Digite suas credenciais para entrar");
		Login.setVisible(true);
		Frames.frameLogin.getContentPane().add(Hora);
		Login.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		Login.setBounds(37, 49, 935, 67);
		Frames.frameLogin.getContentPane().add(Login);

		JLabel JlUsuario = new JLabel("Usuário: ");
		JlUsuario.setBounds(10, 99, 140, 27);
		JlUsuario.setVisible(true);
		txtUsuario = new JTextField();
		txtUsuario.setBounds(70, 99, 140, 27);
		Frames.frameLogin.getContentPane().add(txtUsuario);
		Frames.frameLogin.getContentPane().add(JlUsuario);
		Frames.frameLogin.getContentPane().setBackground(
				new java.awt.Color(220, 230, 254));
		JlUsuario.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		JLabel JlSenha = new JLabel("Senha: ");
		JlSenha.setBounds(10, 130, 140, 27);
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(70, 130, 140, 27);
		Frames.frameLogin.getContentPane().add(txtSenha);
		Frames.frameLogin.getContentPane().add(JlSenha);
		JlSenha.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		

		// Serve pra setar o foco no campo de usuário ao iniciar o sistema
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				txtUsuario.requestFocus();
			}
		});

		txtUsuario.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Buttons.btnEntrar.doClick();
				}
			}

		});

		txtSenha.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Buttons.btnEntrar.doClick();
				}
			}

		});

	}
}
