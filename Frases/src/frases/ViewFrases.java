package frases;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Font;

//import com.sun.awt.AWTUtilities;

public class ViewFrases {

	public JFrame frame;
	public static JFrame frame2;
	public static JFrame frame3;
	public static JFrame frmInicio;
	public JTextArea txtFrases;
	public JTextArea NovaFrase;
	public static JTextArea txtFrases2;
	public JButton btnSair;
	public JButton btnFeliz;
	public JButton btnTriste;
	public JButton btnNovaFrase;
	public JButton btnSalvar;
	public static JButton btnInicio;
	public JButton btnMotivacional;
	public boolean motivacao;
	public boolean triste;
	public boolean feliz;
	public String line;
	public static String frase;

	/**
	 * Launch the application.
	 * 
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {
		Inicio();
	}

	public static void Inicio() {
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

		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lbsuafrase.setBounds(37, 29, 935, 67);
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

		try {
			FileWriter fw = new FileWriter("D:/Frases/Novas_frases.txt", true);
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

	public void AddFrase() {
		frame3 = new JFrame("Frase do dia");
		frame3.getContentPane().setBackground(Color.WHITE);
		frame3.setBounds(900, 100, 567, 240);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		JLabel lbsuafrase = new JLabel("Digite a nova frase abaixo:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 225, 27);
		frame3.getContentPane().add(lbsuafrase);
		ViewFrases window = new ViewFrases();
		window.frame3.setVisible(true);
		NovaFrase = new JTextArea();
		NovaFrase.setLineWrap(true);
		NovaFrase.setWrapStyleWord(true);
		NovaFrase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		NovaFrase.setMargin(new Insets(5, 5, 5, 5));
		NovaFrase.setBounds(21, 77, 492, 57);
		frame3.getContentPane().add(NovaFrase);
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
		frame3.getContentPane().add(btnSair);

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
		frame3.getContentPane().add(btnSalvar);

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

	public void Mapeamento() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 1; ++i) {
			String s = null;
			if (feliz) {
				try {
					s = choose(new File("txt/Feliz.txt"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (triste) {
				try {
					s = choose(new File("txt/Triste.txt"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (motivacao) {
				try {
					s = choose(new File("txt/Motivacional.txt"));
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

		// Criação dos botões
		btnFeliz = new JButton("Feliz");
		btnFeliz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				feliz = true;
				Geracao();
				Mapeamento();
			}
		});
		btnFeliz.setBounds(21, 166, 123, 27);
		frame.getContentPane().add(btnFeliz);

		btnTriste = new JButton("Triste");
		btnTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				triste = true;
				Geracao();
				Mapeamento();
			}
		});
		btnTriste.setBounds(150, 166, 123, 27);
		frame.getContentPane().add(btnTriste);

		btnMotivacional = new JButton("Motivacional");
		btnMotivacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				motivacao = true;
				Geracao();
				Mapeamento();
			}
		});
		btnMotivacional.setBounds(279, 166, 123, 27);
		frame.getContentPane().add(btnMotivacional);

		btnNovaFrase = new JButton("Add Frase");
		btnNovaFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddFrase();

			}
		});
		btnNovaFrase.setBounds(500, 135, 30, 27);
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
