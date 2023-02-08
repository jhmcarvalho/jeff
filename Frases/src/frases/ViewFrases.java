package frases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import util.Buttons;
import util.Frames;
import util.Horario;
import util.Inicio;
import util.Mapeamento;

//import com.sun.awt.AWTUtilities;

public class ViewFrases {

	public JTextArea txtFrases;
	public JTextArea Categoria;
	public static JTextArea NovaFrase;
	public static JTextArea txtFrases2;
	public static JTextArea Result;
	public static JTextField txtUsuario;
	public static JPasswordField txtSenha;

	public static JCheckBox btnExibirSenha;
	public JButton btnMotivacional;
	public JButton btnPergunta;
	public static boolean motivacao;
	public static boolean triste;
	public static boolean feliz;
	public static boolean addFeliz;
	public static boolean pergunta;
	public static String frase;

	/**
	 * Launch the application.
	 * 
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {
		Login();
		// Inicio();
		// Fundo();
		// Mapeamento.Geracao();

	}

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
		Buttons.txtSenha = new JPasswordField();
		Buttons.txtSenha.setBounds(70, 130, 140, 27);
		Frames.frameLogin.getContentPane().add(Buttons.txtSenha);
		Frames.frameLogin.getContentPane().add(JlSenha);
		JlSenha.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		

		// Seta o foco no campo de usuário ao iniciar o sistema
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				txtUsuario.requestFocus();
			}
		});
		
		//Chama a função de entrar no sistema com a tecla Enter
		//KeyboardFocusManager é melhor do que o KeyListener nesse caso pois o segundo só pega o campo onde estiver o foco
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(new KeyEventDispatcher() {
					@Override
					public boolean dispatchKeyEvent(KeyEvent event) {
						if (event.getID() == KeyEvent.KEY_RELEASED
								&& event.getKeyCode() == KeyEvent.VK_ENTER) {
							Buttons.btnEntrar.doClick();
							return true;
						}
						return false;
					}
				});
		}

	public ViewFrases() {
		Frames.Frames();
		Buttons.Botoes();

		JLabel lbsuafrase = new JLabel("SUA FRASE DO DIA \u00C9:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 325, 27);
		Frames.frame.getContentPane().add(lbsuafrase);
		txtFrases = new JTextArea();
		txtFrases.setLineWrap(true);
		txtFrases.setWrapStyleWord(true);
		txtFrases.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtFrases.setMargin(new Insets(5, 5, 5, 5));
		txtFrases.setText(frase);
		txtFrases.setBounds(21, 77, 610, 67);
		Frames.frame.getContentPane().add(txtFrases);
		txtFrases.setColumns(10);
		txtFrases.setEditable(false);
		txtFrases.setBackground(Color.WHITE);


	}
}