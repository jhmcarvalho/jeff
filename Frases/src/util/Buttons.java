package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import frases.ViewFrases;

public class Buttons {

	public static JButton btnInicio;
	public static JButton btnVoltar;
	public static JButton btnVoltarAdd;
	public static JButton btnSalvar;
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
	public static JFrame frame;
	public static JFrame frame3;
	public static JFrame frameNovaFrase;
	public static JFrame frameInicio;


	public static JFrame Botoes() {
		
		frame = new JFrame("Frase do dia");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(900, 100, 667, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new java.awt.Color(220, 230, 254));
		
		frame3 = new JFrame("Frase do dia");
		frame3.setBounds(900, 100, 667, 250);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		frame3.getContentPane()
				.setBackground(new java.awt.Color(220, 230, 254));
		
		frameNovaFrase = new JFrame("Frase do dia");
		frameNovaFrase.getContentPane().setBackground(Color.WHITE);
		frameNovaFrase.setBounds(900, 100, 667, 250);
		frameNovaFrase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameNovaFrase.getContentPane().setLayout(null);
		frameNovaFrase.getContentPane().setBackground(new java.awt.Color(220, 230, 254));
		
		frameInicio = new JFrame("Frase do dia");
		frameInicio.setBounds(900, 100, 667, 250);
		frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameInicio.getContentPane().setLayout(null);
		frameInicio.getContentPane().setBackground(new java.awt.Color(220, 230, 254));
		
		BufferedImage btnFelizIcon = null;
		BufferedImage btnTristeIcon = null;
		BufferedImage btnMotivacionalIcon = null;
		BufferedImage btnPerguntaIcon = null;
		BufferedImage btnSairIcon = null;
		BufferedImage btnVoltarIcon = null;
		BufferedImage btnNovaFraseIcon = null;
		BufferedImage btnSalvarIcon = null;
		BufferedImage btnOk = null;
		
		try {
			btnFelizIcon = ImageIO.read(new File("img/icons/feliz_button.png"));
			btnTristeIcon = ImageIO.read(new File("img/icons/triste_button.png"));
			btnMotivacionalIcon = ImageIO.read(new File("img/icons/motivacional_button.png"));
			btnPerguntaIcon = ImageIO.read(new File("img/icons/pergunta_button.png"));
			btnSairIcon = ImageIO.read(new File("img/icons/sair_button.png"));
			btnVoltarIcon = ImageIO.read(new File("img/icons/voltar_button.png"));
			btnNovaFraseIcon = ImageIO.read(new File("img/icons/mais_button.png"));
			btnSalvarIcon = ImageIO.read(new File("img/icons/salvar_button.png"));
			btnOk = ImageIO.read(new File("img/icons/ok_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JButton btnInicio = new JButton(new ImageIcon(btnOk));
		btnInicio.setBorderPainted(false); //mudar pra true para exibir a borda do tamanho do campo
		btnInicio.setContentAreaFilled(false);
	    btnInicio.setBounds(300, 106, 55, 55);
		btnInicio.setHorizontalAlignment(SwingConstants.CENTER);	
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameInicio.dispose();
				ViewFrases.Geracao();
				ViewFrases.frase = "\n                       Selecione uma categoria para gerar sua frase";
			}
		});
		
		JButton btnNovaFrase = new JButton(new ImageIcon(btnNovaFraseIcon));
		btnNovaFrase.setBorderPainted(false);
		btnNovaFrase.setContentAreaFilled(false);
		btnNovaFrase.setBounds(463, 162, 35, 35);
		Buttons.frame.getContentPane().add(btnNovaFrase);
		btnNovaFrase.setToolTipText("Nova frase");
		
		btnNovaFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame3.dispose();
				ViewFrases.Categoria();

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
				frame.dispose();
				ViewFrases.feliz = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
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
				frame3.dispose();
				frame.dispose();
				ViewFrases.feliz = true;
				ViewFrases.AddFrase();
			}
		});
		
		
		btnTriste = new JButton(new ImageIcon(btnTristeIcon));
		btnTriste.setToolTipText("Feliz");
		btnTriste.setBorderPainted(false);
		btnTriste.setContentAreaFilled(false);
		btnTriste.setBounds(135, 155, 45, 45);
		btnTriste.setHorizontalAlignment(SwingConstants.CENTER);
		btnTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ViewFrases.triste = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
			}
		});
		btnTristeAdd = new JButton(new ImageIcon(btnTristeIcon));
		btnTristeAdd.setToolTipText("Feliz");
		btnTristeAdd.setBorderPainted(false);
		btnTristeAdd.setContentAreaFilled(false);
		btnTristeAdd.setBounds(135, 155, 45, 45);
		btnTristeAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnTristeAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				frame.dispose();
				ViewFrases.triste = true;
				ViewFrases.AddFrase();
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
				frame.dispose();
				ViewFrases.motivacao = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
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
				frame3.dispose();
				frame.dispose();
				ViewFrases.motivacao = true;
				ViewFrases.AddFrase();
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
				frame.dispose();
				ViewFrases.pergunta = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
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
				frame3.dispose();
				frame.dispose();
				ViewFrases.pergunta = true;
				ViewFrases.AddFrase();
			}
		});
		
		btnSair = new JButton(new ImageIcon(btnSairIcon));
		btnSair.setToolTipText("Sair");
		btnSair.setBorderPainted(false);
		btnSair.setContentAreaFilled(false);
		btnSair.setBounds(585, 155, 45, 45);
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
		btnSairAdd.setBounds(585, 155, 45, 45);
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
		btnVoltar.setBorderPainted(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBounds(463, 155, 45, 45);
		btnVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				frame.dispose();
				frameNovaFrase.dispose();
				ViewFrases.Geracao();
			}
		});
		btnVoltarAdd = new JButton(new ImageIcon(btnVoltarIcon));
		btnVoltarAdd.setBorderPainted(false);
		btnVoltarAdd.setContentAreaFilled(false);
		btnVoltarAdd.setBounds(463, 155, 45, 45);
		btnVoltarAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnVoltarAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
				frame.dispose();
				frameNovaFrase.dispose();
				ViewFrases.Geracao();
			}
		});

		btnSalvar = new JButton(new ImageIcon(btnSalvarIcon));
		btnSalvar.setBorderPainted(false);
		btnSalvar.setContentAreaFilled(false);
		btnSalvar.setBounds(35, 162, 35, 35);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ViewFrases.MetodoAdd(ViewFrases.line);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		

		frame.getContentPane().add(btnFeliz);
		frame.getContentPane().add(btnTriste);
		frame.getContentPane().add(btnMotivacional);
		frame.getContentPane().add(btnPergunta);
		frame.getContentPane().add(btnSair);
		frame3.getContentPane().add(btnFelizAdd);
		frame3.getContentPane().add(btnTristeAdd);
		frame3.getContentPane().add(btnMotivacionalAdd);
		frame3.getContentPane().add(btnPerguntaAdd);
		frame3.getContentPane().add(btnSairAdd);
		frame3.getContentPane().add(btnVoltar);
		frameNovaFrase.getContentPane().add(btnSalvar);
		frameNovaFrase.getContentPane().add(btnVoltarAdd);
		frameInicio.getContentPane().add(btnInicio);
		
		return null;

	}
	
}
