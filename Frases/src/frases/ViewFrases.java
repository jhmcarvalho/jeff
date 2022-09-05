package frases;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;

import javax.imageio.ImageIO;
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

import java.awt.Font;

//import com.sun.awt.AWTUtilities;

public class ViewFrases {

	public JFrame frame;
	public static JFrame frame2;
	public static JFrame frame3;
	public static JFrame frameNovaFrase;
	public static JFrame frameLogin;
	public static JFrame frmInicio;
	public JTextArea txtFrases;
	public JTextArea Categoria;
	public JTextArea NovaFrase;
	public static JTextArea txtFrases2;
	public static JTextArea Result;
	public JButton btnSair;
	public JButton btnFeliz;
	public JButton btnTriste;
	public JButton btnNovaFrase;
	public JButton btnSalvar;
	public JButton btnVoltar;
	public JButton btnFundo;
	public static JButton btnEntrar;
	public static JButton btnInicio;
	public static JCheckBox btnExibirSenha;
	public JButton btnMotivacional;
	public JButton btnPergunta;
	public boolean motivacao;
	public boolean triste;
	public boolean feliz;
	public boolean pergunta;
	public String line;
	public static String frase;
	public static String showHora;
	public static String verificaLogin;
	public static String Resultado;

	/**
	 * Launch the application.
	 * 
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {
		Login();
		//Fundo();
		//Geracao();
		// Fundo();
	}

	public static void Login() {
		BoasVindas();
		ViewFrases window = new ViewFrases();
		frameLogin = new JFrame("Bem vindo(a) ao sistema!");
		window.frameLogin.setVisible(true);
		frameLogin.getContentPane().setBackground(Color.WHITE);
		frameLogin.setBounds(900, 100, 567, 240);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.getContentPane().setLayout(null);

		JLabel Hora = new JLabel(showHora);
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
		JTextField txtUsuario = new JTextField();
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

	}

	public static void BoasVindas() {
		Calendar calendar = Calendar.getInstance(TimeZone
				.getTimeZone("Brazil/East"));
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		// System.out.println(hora);
		if (hora < 12) {
			showHora = "Bom dia";// , usuario;
		} else {
			showHora = "Boa tarde";// , usuario;
		}

	}

	public static void Inicio() {
		BoasVindas();

		JLabel Hora = new JLabel(showHora);
		frame2 = new JFrame("Frase do dia");
		frame2.setBounds(900, 100, 667, 240);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		frame2.getContentPane()
				.setBackground(new java.awt.Color(220, 230, 254));
		ViewFrases window = new ViewFrases();
		window.frame2.setVisible(true);
		JLabel lbsuafrase = new JLabel(
				"Bem vindo ao programa gerador de frases diarias aperte OK para continuar");
		lbsuafrase.setVisible(true);
		Hora.setBounds(15, 3, 435, 37);
		Hora.setFont(new Font("Rockwell", Font.BOLD, 15));
		Hora.setVisible(true);
		frame2.getContentPane().add(Hora);

		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lbsuafrase.setBounds(87, 49, 935, 67);
		frame2.getContentPane().add(lbsuafrase);
		btnInicio = new JButton("OK");
		btnInicio.setBounds(250, 106, 165, 57);
		btnInicio.setHorizontalAlignment(SwingConstants.CENTER);
		btnInicio.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnInicio.setBackground(Color.LIGHT_GRAY);
		frame2.getContentPane().add(btnInicio);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				Geracao();
				frase = "\n                       Selecione uma categoria para gerar sua frase";
			}
		});
	}

	public void MetodoAdd(String path) throws IOException {
		String frase = NovaFrase.getText();
		if (feliz) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Feliz.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (triste) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Triste.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (motivacao) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Motivacional.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (pergunta) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Pergunta.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(null, "Frase salva com sucesso");
		NovaFrase.setText(null);
	}

	public void Categoria() {
		frame3 = new JFrame("Frase do dia");
		frame3.setBounds(900, 100, 667, 240);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		frame3.getContentPane()
				.setBackground(new java.awt.Color(220, 230, 254));

		JLabel lbsuafrase = new JLabel("Escolha a categoria da frase:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 325, 27);
		frame3.getContentPane().add(lbsuafrase);
		ViewFrases window = new ViewFrases();
		window.frame3.setVisible(true);
		Botoes();

		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(433, 172, 103, 27);
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnVoltar.setForeground(new java.awt.Color(0, 0, 255));
		btnVoltar.setBackground(new java.awt.Color(101, 171, 255));
		frame3.getContentPane().add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				Geracao();
			}
		});

		frame3.getContentPane().add(btnFeliz);
		frame3.getContentPane().add(btnTriste);
		frame3.getContentPane().add(btnMotivacional);
		frame3.getContentPane().add(btnPergunta);
		frame3.getContentPane().add(btnSair);

		btnFeliz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				feliz = true;
				AddFrase();
			}
		});
		btnTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				frame.dispose();
				triste = true;
				AddFrase();
			}
		});
		btnMotivacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				frame.dispose();
				motivacao = true;
				AddFrase();
			}
		});
		btnPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				frame.dispose();
				pergunta = true;
				AddFrase();
			}
		});

	}

	public void AddFrase() {
		frameNovaFrase = new JFrame("Frase do dia");
		frameNovaFrase.getContentPane().setBackground(Color.WHITE);
		frameNovaFrase.setBounds(900, 100, 667, 240);
		frameNovaFrase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameNovaFrase.getContentPane().setLayout(null);
		frameNovaFrase.getContentPane().setBackground(
				new java.awt.Color(220, 230, 254));
		JLabel NovaF = new JLabel("Digite a nova frase:", JLabel.CENTER);
		NovaF.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 26));
		NovaF.setBounds(142, 39, 325, 27);
		frameNovaFrase.getContentPane().add(NovaF);
		ViewFrases window = new ViewFrases();
		window.frameNovaFrase.setVisible(true);
		NovaFrase = new JTextArea();
		NovaFrase.setLineWrap(true);
		NovaFrase.setWrapStyleWord(true);
		NovaFrase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		NovaFrase.setMargin(new Insets(5, 5, 5, 5));
		NovaFrase.setBounds(21, 77, 610, 67);
		frameNovaFrase.getContentPane().add(NovaFrase);
		NovaFrase.setColumns(10);
		NovaFrase.setEditable(true);
		NovaFrase.setBackground(Color.WHITE);

		btnSair = new JButton("Sair");

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int retorno = JOptionPane
						.showConfirmDialog(null, "Deseja realmente sair?",
								"Confirmação de saída",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);

				if (retorno == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSair.setBounds(508, 172, 123, 27);
		btnSair.setBackground(new java.awt.Color(255, 146, 144));
		btnSair.setForeground(Color.RED);
		frameNovaFrase.getContentPane().add(btnSair);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MetodoAdd(line);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSalvar.setBounds(21, 172, 123, 27);
		btnSalvar.setForeground(new java.awt.Color(0, 0, 255));
		btnSalvar.setBackground(new java.awt.Color(101, 171, 255));
		frameNovaFrase.getContentPane().add(btnSalvar);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(262, 172, 123, 27);
		btnVoltar.setForeground(new java.awt.Color(0, 0, 255));
		btnVoltar.setBackground(new java.awt.Color(101, 171, 255));
		frameNovaFrase.getContentPane().add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameNovaFrase.dispose();
				Geracao();
			}
		});

	}

	public void Mapeamento() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 1; ++i) {
			String s = null;
			if (feliz) {
				try {
					s = choose(new File("C:/Dev/jeff/Frases/txt/Feliz.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (triste) {
				try {
					s = choose(new File("C:/Dev/jeff/Frases/txt/Triste.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (motivacao) {
				try {
					s = choose(new File(
							"C:/Dev/jeff/Frases/txt/Motivacional.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (pergunta) {
				try {
					s = choose(new File("C:/Dev/jeff/Frases/txt/Pergunta.txt"));
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
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String choose(File f) throws FileNotFoundException {
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
		frame = new JFrame("Frase do dia");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(900, 100, 667, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new java.awt.Color(220, 230, 254));

		JLabel lbsuafrase = new JLabel("SUA FRASE DO DIA \u00C9:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 325, 27);
		frame.getContentPane().add(lbsuafrase);
		txtFrases = new JTextArea();
		txtFrases.setLineWrap(true);
		txtFrases.setWrapStyleWord(true);
		txtFrases.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtFrases.setMargin(new Insets(5, 5, 5, 5));
		txtFrases.setText(frase);
		txtFrases.setBounds(21, 77, 610, 67);
		frame.getContentPane().add(txtFrases);
		txtFrases.setColumns(10);
		txtFrases.setEditable(false);
		txtFrases.setBackground(Color.WHITE);
		Botoes();

		btnFundo = new JButton("Exportar");
		btnFundo.setBounds(600, 6, 35 , 27);
	//	btnFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/exportar.png")));
		ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("img/exportar.png"));
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(18, 18,  java.awt.Image.SCALE_SMOOTH); 
		imageIcon = new ImageIcon(newimg);
		btnFundo.setIcon(imageIcon);
		
		//btnFundo.setFont(new Font("Dialog", Font.BOLD, 11));
//		btnFundo.setForeground(new java.awt.Color(0, 0, 255));
//		btnFundo.setBackground(new java.awt.Color(101, 171, 255));
		frame.getContentPane().add(btnFundo);

		btnFundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (frase != "\n                       Selecione uma categoria para gerar sua frase")
				{
					Fundo();
				}else
				{
					JOptionPane
					.showMessageDialog(
							frameLogin,
							"Gere uma frase antes de exportar!",
							"Falha ao exportar",
							JOptionPane.INFORMATION_MESSAGE);
				}
				//frame.dispose();
				

			}
		});

		btnFeliz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				feliz = true;
				Geracao();
				Mapeamento();
			}
		});

		btnTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				triste = true;
				Geracao();
				Mapeamento();
			}
		});

		btnMotivacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				motivacao = true;
				Geracao();
				Mapeamento();
			}
		});

		btnPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				pergunta = true;
				Geracao();
				Mapeamento();
			}
		});

		btnNovaFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Categoria();

			}
		});
	}

	public void Botoes() {

		btnFeliz = new JButton("Feliz");
		btnFeliz.setBounds(5, 172, 103, 27);
		btnFeliz.setForeground(new java.awt.Color(0, 0, 255));
		btnFeliz.setFont(new Font("Dialog", Font.BOLD, 11));
		btnFeliz.setBackground(new java.awt.Color(101, 171, 255));
		frame.getContentPane().add(btnFeliz);

		btnTriste = new JButton("Triste");
		btnTriste.setBounds(112, 172, 103, 27);
		btnTriste.setFont(new Font("Dialog", Font.BOLD, 11));
		btnTriste.setForeground(new java.awt.Color(0, 0, 255));
		btnTriste.setBackground(new java.awt.Color(101, 171, 255));
		frame.getContentPane().add(btnTriste);

		btnMotivacional = new JButton("Motivacional");
		btnMotivacional.setBounds(219, 172, 103, 27);
		btnMotivacional.setFont(new Font("Dialog", Font.BOLD, 11));
		btnMotivacional.setForeground(new java.awt.Color(0, 0, 255));
		btnMotivacional.setBackground(new java.awt.Color(101, 171, 255));
		frame.getContentPane().add(btnMotivacional);

		btnPergunta = new JButton("Pergunta");
		btnPergunta.setBounds(326, 172, 103, 27);
		btnPergunta.setFont(new Font("Dialog", Font.BOLD, 11));
		btnPergunta.setForeground(new java.awt.Color(0, 0, 255));
		btnPergunta.setBackground(new java.awt.Color(101, 171, 255));
		frame.getContentPane().add(btnPergunta);

		btnNovaFrase = new JButton("Add Frase");
		btnNovaFrase.setBounds(433, 172, 103, 27);
		btnNovaFrase.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNovaFrase.setForeground(new java.awt.Color(0, 0, 255));
		btnNovaFrase.setBackground(new java.awt.Color(101, 171, 255));
		frame.getContentPane().add(btnNovaFrase);

		btnSair = new JButton("Sair");

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int retorno = JOptionPane
						.showConfirmDialog(null, "Deseja realmente sair?",
								"Confirmação de saída",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);

				if (retorno == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSair.setBounds(541, 172, 103, 27);
		btnSair.setForeground(Color.RED);
		btnSair.setFont(new Font("Dialog", Font.BOLD, 11));
		btnSair.setBackground(new java.awt.Color(255, 146, 144));
		frame.getContentPane().add(btnSair);
	}

	public static void Fundo() {
		// obtem e coloca a imagem dentro de uma BufferedImage
		BufferedImage img = null;

		try {
			img = ImageIO.read(new File("img/Fundo.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// // Cria e configura o texto no JLabel

		JLabel label = new JLabel();
		// label.setText(Resultado);
		label.setText("Teste2");
		label.setFont(new Font("Calibri", Font.BOLD, 100));
		label.setForeground(Color.white);
		label.setBounds(0, 0, 867, 440);

		Result = new JTextArea();
		Result.setLineWrap(true);
		Result.setWrapStyleWord(true);
		Result.setBounds(340, 260, 487, 140);
		Result.setVisible(true);

		Result.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		Result.setMargin(new Insets(5, 5, 5, 5));
		Result.setText(Resultado);
		Result.setColumns(10);
		Result.setEditable(false);
		Result.setForeground(Color.WHITE);
		Result.setBackground(new Color(0, 0, 0, 0));

		JScrollPane scrollPane = new JScrollPane(Result);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);

		// Cria e configura a janela
		JFrame janela = new JFrame();
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		//ImageIO.write(getImagem(), "png", new File("C:/NovaImagem.png"));

	}
	

}
