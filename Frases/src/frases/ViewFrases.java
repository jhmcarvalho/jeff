package frases;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

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
	public JButton btnSair;
	public JButton btnFeliz;
	public JButton btnTriste;
	public JButton btnNovaFrase;
	public JButton btnSalvar;
	public static JButton btnEntrar;
	public static JButton btnInicio;
	public static JCheckBox btnExibirSenha;
	public JButton btnMotivacional;
	public boolean motivacao;
	public boolean triste;
	public boolean feliz;
	public String line;
	public static String frase;
	public static String showHora;
	public static String verificaLogin;

	/**
	 * Launch the application.
	 * 
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {
		Login();
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
		JlUsuario.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		JLabel JlSenha = new JLabel("Senha: ");
		JlSenha.setBounds(10, 130, 140, 27);
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(70, 130, 140, 27);
		frameLogin.getContentPane().add(txtSenha);
		frameLogin.getContentPane().add(JlSenha);
		JlSenha.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));

		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(210, 165, 123, 27);
		btnEntrar.setVisible(true);
		frameLogin.getContentPane().add(btnEntrar);

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
		btnExibirSenha.setBounds(210, 130, 123, 27);
		btnExibirSenha.setBackground(Color.WHITE);
		btnExibirSenha.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		frameLogin.getContentPane().add(btnExibirSenha);
		
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
		frame2.getContentPane().setBackground(Color.WHITE);
		frame2.setBounds(900, 100, 567, 240);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		ViewFrases window = new ViewFrases();
		window.frame2.setVisible(true);
		JLabel lbsuafrase = new JLabel(
				"Bem vindo ao programa gerador de frases diarias aperte OK para continuar");
		lbsuafrase.setVisible(true);
		Hora.setBounds(37, 3, 435, 67);
		Hora.setFont(new Font("Rockwell", Font.BOLD, 15));
		Hora.setVisible(true);
		frame2.getContentPane().add(Hora);

		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lbsuafrase.setBounds(37, 49, 935, 67);
		frame2.getContentPane().add(lbsuafrase);
		btnInicio = new JButton("OK");
		btnInicio.setBounds(200, 106, 165, 57);
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
				FileWriter fw = new FileWriter("C:/Dev/jeff/Frases/txt/Feliz.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (triste) {
			try {
				FileWriter fw = new FileWriter("C:/Dev/jeff/Frases/txt/Triste.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (motivacao) {
			try {
				FileWriter fw = new FileWriter("C:/Dev/jeff/Frases/txt/Motivacional.txt",
						true);
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
		frame3.getContentPane().setBackground(Color.WHITE);
		frame3.setBounds(900, 100, 567, 240);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		JLabel lbsuafrase = new JLabel("Escolha a categoria da frase:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 225, 27);
		frame3.getContentPane().add(lbsuafrase);
		ViewFrases window = new ViewFrases();
		window.frame3.setVisible(true);
		Botoes();
		frame3.getContentPane().add(btnFeliz);
		frame3.getContentPane().add(btnTriste);
		frame3.getContentPane().add(btnMotivacional);
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

	}

	public void AddFrase() {
		frameNovaFrase = new JFrame("Frase do dia");
		frameNovaFrase.getContentPane().setBackground(Color.WHITE);
		frameNovaFrase.setBounds(900, 100, 567, 240);
		frameNovaFrase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameNovaFrase.getContentPane().setLayout(null);
		JLabel NovaF = new JLabel("Digite a nova frase:", JLabel.CENTER);
		NovaF.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 26));
		NovaF.setBounds(142, 39, 225, 27);
		frameNovaFrase.getContentPane().add(NovaF);
		ViewFrases window = new ViewFrases();
		window.frameNovaFrase.setVisible(true);
		NovaFrase = new JTextArea();
		NovaFrase.setLineWrap(true);
		NovaFrase.setWrapStyleWord(true);
		NovaFrase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		NovaFrase.setMargin(new Insets(5, 5, 5, 5));
		NovaFrase.setBounds(21, 77, 492, 57);
		frameNovaFrase.getContentPane().add(NovaFrase);
		NovaFrase.setColumns(10);
		NovaFrase.setEditable(true);
		NovaFrase.setBackground(Color.LIGHT_GRAY);

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
		btnSair.setBounds(408, 166, 123, 27);
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
		btnSalvar.setBounds(21, 166, 123, 27);
		frameNovaFrase.getContentPane().add(btnSalvar);

	}

	public void Mapeamento() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 1; ++i) {
			String s = null;
			if (feliz) {
				try {
					s = choose(new File("C:/Dev/jeff/Frases/txt/Feliz.txt"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (triste) {
				try {
					s = choose(new File("C:/Dev/jeff/Frases/txt/Triste.txt"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (motivacao) {
				try {
					s = choose(new File("C:/Dev/jeff/Frases/txt/Motivacional.txt"));
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
		frame.setBounds(900, 100, 567, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbsuafrase = new JLabel("SUA FRASE DO DIA \u00C9:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 225, 27);
		frame.getContentPane().add(lbsuafrase);
		txtFrases = new JTextArea();
		txtFrases.setLineWrap(true);
		txtFrases.setWrapStyleWord(true);
		txtFrases.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtFrases.setMargin(new Insets(5, 5, 5, 5));
		txtFrases.setText(frase);
		txtFrases.setBounds(21, 77, 492, 57);
		frame.getContentPane().add(txtFrases);
		txtFrases.setColumns(10);
		txtFrases.setEditable(false);
		txtFrases.setBackground(Color.LIGHT_GRAY);
		Botoes();

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

		btnNovaFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Categoria();

			}
		});
	}

	public void Botoes() {

		btnFeliz = new JButton("Feliz");
		btnFeliz.setBounds(21, 166, 123, 27);
		frame.getContentPane().add(btnFeliz);

		btnTriste = new JButton("Triste");
		btnTriste.setBounds(150, 166, 123, 27);
		frame.getContentPane().add(btnTriste);

		btnMotivacional = new JButton("Motivacional");
		btnMotivacional.setBounds(279, 166, 123, 27);
		frame.getContentPane().add(btnMotivacional);

		btnNovaFrase = new JButton("Add Frase");
		btnNovaFrase.setBounds(408, 145, 123, 20);
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
		btnSair.setBounds(408, 166, 123, 27);
		btnSair.setForeground(Color.RED);
		frame.getContentPane().add(btnSair);
	}
}
