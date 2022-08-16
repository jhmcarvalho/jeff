package frases;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Font;

//import com.sun.awt.AWTUtilities;

public class ViewFrases {

	public JFrame frame;
	public static JFrame frame2;
	public static JFrame frmInicio;
	public JTextArea txtFrases;
	public static JTextArea txtFrases2;
	public JButton btnSair;
	public JButton btnFeliz;
	public JButton btnTriste;
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

	//	JTextArea lbsuafrase = new JTextArea("Bem vindo ao programa gerador de frases diarias aperte OK para continuar");
		JLabel lbsuafrase = new JLabel("Bem vindo ao programa gerador de frases diarias aperte OK para continuar");
		lbsuafrase.setVisible(true);
	//	lbsuafrase.setLineWrap(true);
	//	lbsuafrase.setWrapStyleWord(true);

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
				Geracao();
				frase = "\n                       Selecione uma categoria para gerar sua frase";
			}
		});
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
				motivacao = true;
				Geracao();
				Mapeamento();
			}
		});
		btnMotivacional.setBounds(279, 166, 123, 27);
		frame.getContentPane().add(btnMotivacional);

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
