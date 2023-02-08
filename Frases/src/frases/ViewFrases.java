package frases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import org.eclipse.swt.widgets.Button;

import util.Buttons;
import util.Horario;

import java.awt.Font;

//import com.sun.awt.AWTUtilities;

public class ViewFrases {


	//public static JFrame frame2;

	public static JFrame frameLogin;
	public static JFrame frmInicio;
	public JTextArea txtFrases;
	public JTextArea Categoria;
	public static JTextArea NovaFrase;
	public static JTextArea txtFrases2;
	public static JTextArea Result;
	public static JTextField txtUsuario;
	public JButton btnSair;
	public JButton btnFeliz;
	//public JButton btnTriste;
	public JButton btnNovaFrase;
	public static JButton btnSalvar;
	public JButton btnVoltar;
	public static JButton btnEntrar;
	public static JButton btnInicio;
	public static JCheckBox btnExibirSenha;
	public JButton btnMotivacional;
	public JButton btnPergunta;
	public static boolean motivacao;
	public static boolean triste;
	public static boolean feliz;
	public static boolean addFeliz;
	public static boolean pergunta;
	public static String line;
	public static String frase;
	public static String showHora;
	public static String verificaLogin;
	public static String Resultado;
	public static int randomNum;

	/**
	 * Launch the application.
	 * 
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {
		Login();
		//Inicio();
		// Fundo();
		 //Geracao();

		
//		SwingUtilities.invokeLater( new Runnable() { 
//
//			public void run() { 
//			        txtUsuario.requestFocus(); 
//			    } 
//			} );
		
	}
	

	public static void Login() {
		ViewFrases window = new ViewFrases();
		frameLogin = new JFrame("Bem vindo(a) ao sistema!");
		window.frameLogin.setVisible(true);
		frameLogin.getContentPane().setBackground(Color.WHITE);
		frameLogin.setBounds(900, 100, 567, 250);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.getContentPane().setLayout(null);
		// frameLogin.getRootPane().setDefaultButton(btnEntrar);

		JLabel Hora = new JLabel(Horario.BoasVindas());
		Hora.setBounds(37, 3, 435, 67);
		Hora.setFont(new Font("Rockwell", Font.BOLD, 15));
		Hora.setVisible(true);
		JLabel Login = new JLabel(
				"Bem vindo ao programa gerador de frases! Digite suas credenciais para entrar");
		Login.setVisible(true);
		frameLogin.getContentPane().add(Hora);
		Login.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		Login.setBounds(37, 49, 935, 67);
		frameLogin.getContentPane().add(Login);

		JLabel JlUsuario = new JLabel("Usuário: ");
		JlUsuario.setBounds(10, 99, 140, 27);
		JlUsuario.setVisible(true);
		txtUsuario = new JTextField();
		txtUsuario.setBounds(70, 99, 140, 27);
		frameLogin.getContentPane().add(txtUsuario);
		frameLogin.getContentPane().add(JlUsuario);
		frameLogin.getContentPane().setBackground(
				new java.awt.Color(220, 230, 254));
		JlUsuario.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		JLabel JlSenha = new JLabel("Senha: ");
		JlSenha.setBounds(10, 130, 140, 27);
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(70, 130, 140, 27);
		frameLogin.getContentPane().add(txtSenha);
		frameLogin.getContentPane().add(JlSenha);
		JlSenha.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		btnEntrar = new JButton("Entrar");
		frameLogin.getContentPane().add(btnEntrar);
		btnEntrar.setBounds(210, 165, 123, 27);
		btnEntrar.setVisible(true);

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals("jeff")) {

					if (Arrays.equals(txtSenha.getPassword(), new char[] { 'd',
							'8', 'h', 'j', '0', 'p', 't', 'r' })) {
						Inicio();
						frameLogin.dispose();
					} else
						JOptionPane
								.showMessageDialog(
										frameLogin,
										"Usuário ou senha incorreta! Verifique se você possui permissão",
										"Falha ao logar",
										JOptionPane.INFORMATION_MESSAGE);
				} else
					JOptionPane
							.showMessageDialog(
									frameLogin,
									"Usuário ou senha incorreta! Verifique se você possui permissão",
									"Falha ao logar",
									JOptionPane.INFORMATION_MESSAGE);

			}

		});
		
		//Serve pra setar o foco no campo de usuário ao iniciar o sistema
		SwingUtilities.invokeLater( new Runnable() { 

			public void run() { 
			        txtUsuario.requestFocus(); 
			    } 
			} );
		
		txtUsuario.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnEntrar.doClick();
				}
			}

		});

		txtSenha.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnEntrar.doClick();
				}
			}

		});

		btnExibirSenha = new JCheckBox("Exibir senha");
		frameLogin.getContentPane().add(btnExibirSenha);
		btnExibirSenha.setBounds(210, 130, 123, 27);
		btnExibirSenha.setBackground(new java.awt.Color(220, 230, 254));
		btnExibirSenha.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		char defaultt = txtSenha.getEchoChar();
		btnExibirSenha.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (btnExibirSenha.isSelected()) {
					txtSenha.setEchoChar((char) 0);
				} else {
					txtSenha.setEchoChar(defaultt);
				}
			}
		});

		btnExibirSenha.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnEntrar.doClick();
				}
			}

		});

	}

	public static void Inicio() {

		JLabel Hora = new JLabel(Horario.BoasVindas());
		Buttons.frameInicio.setVisible(true);
		JLabel lbsuafrase = new JLabel(
				"Bem vindo ao programa gerador de frases diarias aperte OK para continuar");
		lbsuafrase.setVisible(true);
		Hora.setBounds(15, 3, 435, 37);
		Hora.setFont(new Font("Rockwell", Font.BOLD, 15));
		Hora.setVisible(true);
		Buttons.frameInicio.getContentPane().add(Hora);

		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lbsuafrase.setBounds(87, 49, 935, 67);
		Buttons.frameInicio.getContentPane().add(lbsuafrase);
		
	}

	public static void MetodoAdd(String path) throws IOException {
		String frase = NovaFrase.getText();
		if (!frase.isEmpty()) {
			if (feliz) {
				try {
					FileWriter fw = new FileWriter("txt/Feliz.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (triste) {
				try {
					FileWriter fw = new FileWriter("txt/Triste.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (motivacao) {
				try {
					FileWriter fw = new FileWriter("txt/Motivacional.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (pergunta) {
				try {
					FileWriter fw = new FileWriter("txt/Pergunta.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Frase salva com sucesso");
				NovaFrase.setText(null);
			}
		} else
			JOptionPane.showMessageDialog(null, "Digite uma frase para salvar");

	}

	public static void Categoria() {
		
		JLabel lbsuafrase = new JLabel("Escolha a categoria da frase:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 325, 27);
		Buttons.frame3.getContentPane().add(lbsuafrase);
		Buttons.frame3.setVisible(true);

//		frame3.getContentPane().add(Buttons.botaoTriste());
//		frame3.getContentPane().add(Buttons.botaoMotivacional());
//		frame3.getContentPane().add(Buttons.botaoPergunta());
//		frame3.getContentPane().add(Buttons.botaoSair());

		
		
//		Buttons.btnFeliz.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			frame3.dispose();
//			frame.dispose();
//			triste = true;
//			AddFrase();
//		}
//	});
//		btnTriste.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame3.dispose();
//				frame.dispose();
//				triste = true;
//				AddFrase();
//			}
//		});
//		btnMotivacional.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame3.dispose();
//				frame.dispose();
//				motivacao = true;
//				AddFrase();
//			}
//		});
//		btnPergunta.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame3.dispose();
//				frame.dispose();
//				pergunta = true;
//				AddFrase();
//			}
//		});
//
	}

	public static void AddFrase() {
		
		JLabel NovaF = new JLabel("Digite a nova frase:", JLabel.CENTER);
		NovaF.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 26));
		NovaF.setBounds(142, 39, 325, 27);
		Buttons.frameNovaFrase.getContentPane().add(NovaF);
		Buttons.frameNovaFrase.setVisible(true);
		NovaFrase = new JTextArea();
		NovaFrase.setLineWrap(true);
		NovaFrase.setWrapStyleWord(true);
		NovaFrase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		NovaFrase.setMargin(new Insets(5, 5, 5, 5));
		NovaFrase.setBounds(21, 77, 610, 67);
		Buttons.frameNovaFrase.getContentPane().add(NovaFrase);
		NovaFrase.setColumns(10);
		NovaFrase.setEditable(true);
		NovaFrase.setBackground(Color.WHITE);

		

	}

	public static void Mapeamento() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 1; ++i) {
			String s = null;
			if (feliz) {
				try {
					s = choose(new File("txt/Feliz.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (triste) {
				try {
					s = choose(new File("txt/Triste.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (motivacao) {
				try {
					s = choose(new File("txt/Motivacional.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (pergunta) {
				try {
					s = choose(new File("txt/Pergunta.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (!map.containsKey(s))
				map.put(s, 0);
			map.put(s, map.get(s) + 1);
		}
	}

	public static void Geracao() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFrases window = new ViewFrases();
					Buttons.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static String choose(File f) throws FileNotFoundException {
		// String frase = null;
		Random Rand = new Random();
		int n = 0;
		for (Scanner sc = new Scanner(f); sc.hasNext();) {
			++n;
			String line = sc.nextLine();
			if (Rand.nextInt(n) == 0)
				frase = line;

		}

		return frase;

	}

	public ViewFrases() {

		// Criação do frame
		Buttons.Botoes();
		

		JLabel lbsuafrase = new JLabel("SUA FRASE DO DIA \u00C9:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 325, 27);
		Buttons.frame.getContentPane().add(lbsuafrase);
		txtFrases = new JTextArea();
		txtFrases.setLineWrap(true);
		txtFrases.setWrapStyleWord(true);
		txtFrases.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtFrases.setMargin(new Insets(5, 5, 5, 5));
		txtFrases.setText(frase);
		txtFrases.setBounds(21, 77, 610, 67);
		Buttons.frame.getContentPane().add(txtFrases);
		txtFrases.setColumns(10);
		txtFrases.setEditable(false);
		txtFrases.setBackground(Color.WHITE);

	
		BufferedImage btnFundoIcon = null;
		try {
			btnFundoIcon = ImageIO
					.read(new File("img/icons/fundo_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JButton btnFundo = new JButton(new ImageIcon(btnFundoIcon));
		btnFundo.setBounds(600, 6, 30, 30);
		btnFundo.setToolTipText("Gerar imagem");
		btnFundo.setBorderPainted(false);
		btnFundo.setContentAreaFilled(false);
		btnFundo.setHorizontalAlignment(SwingConstants.CENTER);

		Buttons.frame.getContentPane().add(btnFundo);

		btnFundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (frase != null) {
					Fundo();
				} else {
					JOptionPane.showMessageDialog(frameLogin,
							"Gere uma frase antes de exportar!",
							"Falha ao exportar",
							JOptionPane.INFORMATION_MESSAGE);
				}
				// frame.dispose();

			}
		});
		

			
	}


	public static void Fundo() {
		JLabel label = new JLabel();
		// obtem e coloca a imagem dentro de uma BufferedImage
		BufferedImage img = null;

		try {
			Random rand = new Random();
			randomNum = rand.nextInt((10 - 1) + 1) + 1;
			// randomNum = 10;
			img = ImageIO.read(new File("img/Fundo" + randomNum + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		// // Cria e configura o texto no JLabel
		label.setText("Teste2");
		label.setFont(new Font("Calibri", Font.BOLD, 100));
		label.setForeground(Color.white);
		label.setBounds(0, 0, 867, 440);

		Result = new JTextArea();
		Result.setLineWrap(true);
		Result.setWrapStyleWord(true);
		Result.setBounds(340, 240, 487, 140);
		Result.setVisible(true);
		if (randomNum == 10 || randomNum == 15) {
			Result.setForeground(Color.BLACK);
		} else
			Result.setForeground(Color.WHITE);

		if (randomNum == 12) {
			Result.setBounds(30, 200, 487, 140);
		}
		Result.setFont(new Font("Sitka Text Italic", Font.PLAIN, 25));
		Result.setMargin(new Insets(5, 5, 5, 5));
		Result.setText(Resultado);
		Result.setColumns(10);
		Result.setEditable(false);
		Result.setBackground(new Color(0, 0, 0, 0));

//		JScrollPane scrollPane = new JScrollPane(Result);
//		scrollPane.getViewport().setOpaque(false);
//		scrollPane.setOpaque(false);

		// Cria e configura a janela
		JFrame janela = new JFrame();
		janela.setBounds(850, 100, 867, 440);
		janela.getContentPane().setLayout(null);

		// Força a imagem a ficar do tamanho da janela
		Image dimg = img.getScaledInstance(janela.getWidth(),
				janela.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon imageIcon = new ImageIcon(dimg);
		label.setIcon(imageIcon);

		// mostra a janela e adiciona o label a ela
		janela.setVisible(true);
		janela.add(Result);
		janela.add(label);

	}
}
