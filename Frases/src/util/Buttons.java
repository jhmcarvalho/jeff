package util;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import frases.ViewFrases;

public class Buttons {

	public static JButton btnInicio;
	public static JButton btnVoltar;
	public static JButton btnFeliz;
	public static JButton btnTriste;
	public static JButton btnMotivacional;
	public static JButton btnPergunta;
	public static JButton btnAddFrase;
	public static JButton btnSair;

	public static Component botaoInicio() {
		BufferedImage btnInicioIcon = null;
		try {
			btnInicioIcon = ImageIO.read(new File("img/icons/ok_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnInicio = new JButton(new ImageIcon(btnInicioIcon));
		btnInicio.setBorderPainted(false); // mudar pra true para exibir a borda
											// do tamanho do campo
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBounds(300, 106, 55, 55);
		btnInicio.setHorizontalAlignment(SwingConstants.CENTER);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFrases.frame2.dispose();
				ViewFrases.Geracao();
				ViewFrases.frase = "\n                       Selecione uma categoria para gerar sua frase";
			}
		});

		return btnInicio;

	}

	public static Component botaoVoltar() {
		BufferedImage btnVoltarIcon = null;
		try {
			btnVoltarIcon = ImageIO
					.read(new File("img/icons/voltar_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnVoltar = new JButton(new ImageIcon(btnVoltarIcon));
		btnVoltar.setBorderPainted(false); // mudar pra true para exibir a borda
											// do tamanho do campo
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBounds(463, 155, 45, 45);
		btnVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFrases.frame3.dispose();
				ViewFrases.Geracao();
			}
		});

		return btnVoltar;

	}

	public static Component botaoFeliz() {
		BufferedImage btnFelizIcon = null;
		try {
			btnFelizIcon = ImageIO.read(new File("img/icons/feliz_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnFeliz = new JButton(new ImageIcon(btnFelizIcon));
		btnFeliz.setToolTipText("Feliz");
		btnFeliz.setBorderPainted(false); // mudar pra true para exibir a borda
											// do tamanho do campo
		btnFeliz.setContentAreaFilled(false);
		btnFeliz.setBounds(35, 155, 45, 45);
		btnFeliz.setHorizontalAlignment(SwingConstants.CENTER);
		btnFeliz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFrases.frame.dispose();
				ViewFrases.feliz = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
			}
		});

		return btnFeliz;

	}

	public static Component botaoTriste() {
		BufferedImage btnTristeIcon = null;
		try {
			btnTristeIcon = ImageIO
					.read(new File("img/icons/triste_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnTriste = new JButton(new ImageIcon(btnTristeIcon));
		btnTriste.setToolTipText("Triste");
		btnTriste.setBorderPainted(false); // mudar pra true para exibir a borda
											// do tamanho do campo
		btnTriste.setContentAreaFilled(false);
		btnTriste.setBounds(135, 155, 45, 45);
		btnTriste.setHorizontalAlignment(SwingConstants.CENTER);
		btnTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFrases.frame.dispose();
				ViewFrases.triste = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
			}
		});

		return btnTriste;

	}

	public static Component botaoMotivacional() {
		BufferedImage btnMotivacionalIcon = null;
		try {
			btnMotivacionalIcon = ImageIO.read(new File(
					"img/icons/motivacional_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnMotivacional = new JButton(new ImageIcon(btnMotivacionalIcon));
		btnMotivacional.setToolTipText("Motivacional");
		btnMotivacional.setBorderPainted(false); // mudar pra true para exibir a
													// borda
		// do tamanho do campo
		btnMotivacional.setContentAreaFilled(false);
		btnMotivacional.setBounds(235, 155, 45, 45);
		btnMotivacional.setHorizontalAlignment(SwingConstants.CENTER);
		btnMotivacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFrases.frame.dispose();
				ViewFrases.motivacao = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
			}
		});

		return btnMotivacional;

	}

	public static Component botaoPergunta() {
		BufferedImage btnPerguntaIcon = null;
		try {
			btnPerguntaIcon = ImageIO.read(new File(
					"img/icons/pergunta_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnPergunta = new JButton(new ImageIcon(btnPerguntaIcon));
		btnPergunta.setToolTipText("Pergunta");
		btnPergunta.setBorderPainted(false); // mudar pra true para exibir a
												// borda
												// do tamanho do campo
		btnPergunta.setContentAreaFilled(false);
		btnPergunta.setBounds(335, 155, 45, 45);
		btnPergunta.setHorizontalAlignment(SwingConstants.CENTER);
		btnPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFrases.frame.dispose();
				ViewFrases.pergunta = true;
				ViewFrases.Geracao();
				ViewFrases.Mapeamento();
			}
		});

		return btnPergunta;

	}

	public static Component botaoSair() {
		BufferedImage btnSairIcon = null;
		try {
			btnSairIcon = ImageIO.read(new File("img/icons/sair_button.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnSair = new JButton(new ImageIcon(btnSairIcon));
		btnSair.setToolTipText("Sair");
		btnSair.setBorderPainted(false); // mudar pra true para exibir a borda
											// do tamanho do campo
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

		return btnSair;

	}

}
