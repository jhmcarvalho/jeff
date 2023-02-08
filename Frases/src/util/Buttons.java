package util;

import java.awt.Font;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import frases.ViewFrases;

public class Buttons {

	public static JButton btnInicio;
	public static JButton btnVoltar;
	public static JButton btnVoltarAdd;
	public static JButton btnSalvar;
	public static JButton btnEntrar;
	public static JCheckBox btnExibirSenha;
	public static JButton btnFeliz;
	public static JButton btnFelizAdd;
	public static JButton btnTriste;
	public static JButton btnTristeAdd;
	public static JButton btnMotivacional;
	public static JButton btnMotivacionalAdd;
	public static JButton btnPergunta;
	public static JButton btnPerguntaAdd;
	public static JButton btnAddFrase;
	public static JButton btnSair;
	public static JButton btnSairAdd;
	public static String line;
	public static JPasswordField txtSenha;
	public static JTextField txtUsuario;

	public static JFrame Botoes() {

		BufferedImage btnFelizIcon = null;
		BufferedImage btnTristeIcon = null;
		BufferedImage btnMotivacionalIcon = null;
		BufferedImage btnPerguntaIcon = null;
		BufferedImage btnSairIcon = null;
		BufferedImage btnVoltarIcon = null;
		BufferedImage btnNovaFraseIcon = null;
		BufferedImage btnSalvarIcon = null;
		BufferedImage btnEntrarIcon = null;
		BufferedImage btnOk = null;
		BufferedImage btnFundoIcon = null;
		BufferedImage btnMostrarSenhaIcon = null;

		try {
			btnFelizIcon = ImageIO.read(new File("img/icons/feliz_button.png"));
			btnTristeIcon = ImageIO
					.read(new File("img/icons/triste_button.png"));
			btnMotivacionalIcon = ImageIO.read(new File(
					"img/icons/motivacional_button.png"));
			btnPerguntaIcon = ImageIO.read(new File(
					"img/icons/pergunta_button.png"));
			btnSairIcon = ImageIO.read(new File("img/icons/sair_button.png"));
			btnVoltarIcon = ImageIO
					.read(new File("img/icons/voltar_button.png"));
			btnNovaFraseIcon = ImageIO.read(new File(
					"img/icons/mais_button.png"));
			btnSalvarIcon = ImageIO
					.read(new File("img/icons/salvar_button.png"));
			btnOk = ImageIO.read(new File("img/icons/ok_button.png"));
			btnFundoIcon = ImageIO.read(new File("img/icons/fundo_button.png"));
			btnEntrarIcon = ImageIO
					.read(new File("img/icons/entrar_button.png"));
			btnMostrarSenhaIcon = ImageIO.read(new File("img/icons/olho.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JButton btnFundo = new JButton(new ImageIcon(btnFundoIcon));
		btnFundo.setBounds(585, 155, 45, 45);
		btnFundo.setToolTipText("Gerar imagem");
		btnFundo.setBorderPainted(false);
		btnFundo.setContentAreaFilled(false);
		btnFundo.setHorizontalAlignment(SwingConstants.CENTER);
		btnFundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ViewFrases.frase != null) {
					Fundo.Fundo();
				} else {
					JOptionPane.showMessageDialog(Frames.frameLogin,
							"Gere uma frase antes de exportar!",
							"Falha ao exportar",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		JButton btnInicio = new JButton(new ImageIcon(btnOk));
		btnInicio.setBorderPainted(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBounds(300, 106, 55, 55);
		btnInicio.setHorizontalAlignment(SwingConstants.CENTER);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frameInicio.dispose();
				Mapeamento.Geracao();
				ViewFrases.frase = "\n                       Selecione uma categoria para gerar sua frase";
			}
		});

		JButton btnNovaFrase = new JButton(new ImageIcon(btnNovaFraseIcon));
		btnNovaFrase.setBorderPainted(false);
		btnNovaFrase.setContentAreaFilled(false);
		btnNovaFrase.setBounds(463, 162, 35, 35);
		Frames.frame.getContentPane().add(btnNovaFrase);
		btnNovaFrase.setToolTipText("Nova frase");

		btnNovaFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frame.dispose();
				Frames.frameAdd.dispose();
				Mapeamento.Categoria();

			}
		});

		btnFeliz = new JButton(new ImageIcon(btnFelizIcon));
		btnFeliz.setToolTipText("Feliz");
		btnFeliz.setBorderPainted(false);
		btnFeliz.setContentAreaFilled(false);
		btnFeliz.setBounds(35, 155, 45, 45);
		btnFeliz.setHorizontalAlignment(SwingConstants.CENTER);
		btnFeliz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frame.dispose();
				ViewFrases.feliz = true;
				Mapeamento.Geracao();
				Mapeamento.Mapeamento();
			}
		});
		btnFelizAdd = new JButton(new ImageIcon(btnFelizIcon));
		btnFelizAdd.setToolTipText("Feliz");
		btnFelizAdd.setBorderPainted(false);
		btnFelizAdd.setContentAreaFilled(false);
		btnFelizAdd.setBounds(35, 155, 45, 45);
		btnFelizAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnFelizAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frameAdd.dispose();
				Frames.frame.dispose();
				ViewFrases.feliz = true;
				MetodoAdd.AddFrase();
			}
		});

		btnTriste = new JButton(new ImageIcon(btnTristeIcon));
		btnTriste.setToolTipText("Triste");
		btnTriste.setBorderPainted(false);
		btnTriste.setContentAreaFilled(false);
		btnTriste.setBounds(135, 155, 45, 45);
		btnTriste.setHorizontalAlignment(SwingConstants.CENTER);
		btnTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frame.dispose();
				ViewFrases.triste = true;
				Mapeamento.Geracao();
				Mapeamento.Mapeamento();
			}
		});
		btnTristeAdd = new JButton(new ImageIcon(btnTristeIcon));
		btnTristeAdd.setToolTipText("Triste");
		btnTristeAdd.setBorderPainted(false);
		btnTristeAdd.setContentAreaFilled(false);
		btnTristeAdd.setBounds(135, 155, 45, 45);
		btnTristeAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnTristeAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frameAdd.dispose();
				Frames.frame.dispose();
				ViewFrases.triste = true;
				MetodoAdd.AddFrase();
			}
		});

		btnMotivacional = new JButton(new ImageIcon(btnMotivacionalIcon));
		btnMotivacional.setToolTipText("Motivacional");
		btnMotivacional.setBorderPainted(false);
		btnMotivacional.setContentAreaFilled(false);
		btnMotivacional.setBounds(235, 155, 45, 45);
		btnMotivacional.setHorizontalAlignment(SwingConstants.CENTER);
		btnMotivacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frame.dispose();
				ViewFrases.motivacao = true;
				Mapeamento.Geracao();
				Mapeamento.Mapeamento();
			}
		});
		btnMotivacionalAdd = new JButton(new ImageIcon(btnMotivacionalIcon));
		btnMotivacionalAdd.setToolTipText("Motivacional");
		btnMotivacionalAdd.setBorderPainted(false);
		btnMotivacionalAdd.setContentAreaFilled(false);
		btnMotivacionalAdd.setBounds(235, 155, 45, 45);
		btnMotivacionalAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnMotivacionalAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frameAdd.dispose();
				Frames.frame.dispose();
				ViewFrases.motivacao = true;
				MetodoAdd.AddFrase();
			}
		});

		btnPergunta = new JButton(new ImageIcon(btnPerguntaIcon));
		btnPergunta.setToolTipText("Pergunta");
		btnPergunta.setBorderPainted(false);
		btnPergunta.setContentAreaFilled(false);
		btnPergunta.setBounds(335, 155, 45, 45);
		btnPergunta.setHorizontalAlignment(SwingConstants.CENTER);
		btnPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frame.dispose();
				ViewFrases.pergunta = true;
				Mapeamento.Geracao();
				Mapeamento.Mapeamento();
			}
		});
		btnPerguntaAdd = new JButton(new ImageIcon(btnPerguntaIcon));
		btnPerguntaAdd.setToolTipText("Pergunta");
		btnPerguntaAdd.setBorderPainted(false);
		btnPerguntaAdd.setContentAreaFilled(false);
		btnPerguntaAdd.setBounds(335, 155, 45, 45);
		btnPerguntaAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnPerguntaAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frameAdd.dispose();
				Frames.frame.dispose();
				ViewFrases.pergunta = true;
				MetodoAdd.AddFrase();
			}
		});

		btnSair = new JButton(new ImageIcon(btnSairIcon));
		btnSair.setToolTipText("Sair");
		btnSair.setBorderPainted(false);
		btnSair.setContentAreaFilled(false);
		btnSair.setBounds(610, 5, 22, 22);
		btnSair.setHorizontalAlignment(SwingConstants.CENTER);
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
		btnSairAdd = new JButton(new ImageIcon(btnSairIcon));
		btnSairAdd.setToolTipText("Sair");
		btnSairAdd.setBorderPainted(false);
		btnSairAdd.setContentAreaFilled(false);
		btnSairAdd.setBounds(600, 6, 30, 30);
		btnSairAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnSairAdd.addActionListener(new ActionListener() {
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

		btnVoltar = new JButton(new ImageIcon(btnVoltarIcon));
		btnVoltar.setToolTipText("Voltar");
		btnVoltar.setBorderPainted(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBounds(463, 155, 45, 45);
		btnVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frameAdd.dispose();
				Frames.frame.dispose();
				Frames.frameNovaFrase.dispose();
				Mapeamento.Geracao();
			}
		});
		btnVoltarAdd = new JButton(new ImageIcon(btnVoltarIcon));
		btnVoltarAdd.setToolTipText("Voltar");
		btnVoltarAdd.setBorderPainted(false);
		btnVoltarAdd.setContentAreaFilled(false);
		btnVoltarAdd.setBounds(463, 155, 45, 45);
		btnVoltarAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnVoltarAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frames.frameAdd.dispose();
				Frames.frame.dispose();
				Frames.frameNovaFrase.dispose();
				Mapeamento.Geracao();
			}
		});

		btnSalvar = new JButton(new ImageIcon(btnSalvarIcon));
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.setBorderPainted(false);
		btnSalvar.setContentAreaFilled(false);
		btnSalvar.setBounds(35, 162, 35, 35);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MetodoAdd.MetodoAdd(line);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnEntrar = new JButton(new ImageIcon(btnEntrarIcon));
		btnEntrar.setToolTipText("Sair");
		btnEntrar.setBorderPainted(false);
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setBounds(240, 165, 35, 35);
		btnEntrar.setHorizontalAlignment(SwingConstants.CENTER);

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ViewFrases.txtUsuario.getText().equals("jeff") && ViewFrases.txtUsuario.getText()!= null) {

					if (Arrays.equals(txtSenha.getPassword(), new char[] { 'd',
							'8', 'h', 'j', '0', 'p', 't', 'r' })) {
						Inicio.Inicio();
						Frames.frameLogin.dispose();
					} 
				} else
					JOptionPane
							.showMessageDialog(
									Frames.frameLogin,
									"Usuário ou senha incorreta! Verifique se você possui permissão",
									"Falha ao logar",
									JOptionPane.INFORMATION_MESSAGE);

			}

		});

		btnExibirSenha = new JCheckBox(new ImageIcon(btnMostrarSenhaIcon));
		btnExibirSenha.setToolTipText("Exibir Senha");
		btnExibirSenha.setBorderPainted(false);
		btnExibirSenha.setContentAreaFilled(false);
		btnExibirSenha.setBounds(215, 137, 20, 15);
		btnExibirSenha.setHorizontalAlignment(SwingConstants.CENTER);

		btnExibirSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnExibirSenha.isSelected()) {
					txtSenha.setEchoChar('\u0000');
				} else
					txtSenha.setEchoChar('\u2022');

			}

		});

		Frames.frame.getContentPane().add(btnFeliz);
		Frames.frame.getContentPane().add(btnTriste);
		Frames.frame.getContentPane().add(btnMotivacional);
		Frames.frame.getContentPane().add(btnPergunta);
		Frames.frame.getContentPane().add(btnSair);
		Frames.frameAdd.getContentPane().add(btnFelizAdd);
		Frames.frameAdd.getContentPane().add(btnTristeAdd);
		Frames.frameAdd.getContentPane().add(btnMotivacionalAdd);
		Frames.frameAdd.getContentPane().add(btnPerguntaAdd);
		Frames.frameAdd.getContentPane().add(btnSairAdd);
		Frames.frameAdd.getContentPane().add(btnVoltar);
		Frames.frameNovaFrase.getContentPane().add(btnSalvar);
		Frames.frameNovaFrase.getContentPane().add(btnVoltarAdd);
		Frames.frameInicio.getContentPane().add(btnInicio);
		Frames.frame.getContentPane().add(btnFundo);
		Frames.frameLogin.getContentPane().add(btnEntrar);
		Frames.frameLogin.getContentPane().add(btnExibirSenha);

		return null;

	}

}
