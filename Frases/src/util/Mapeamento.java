package util;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JLabel;

import main.Main;

public class Mapeamento {
	public static void Map() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 1; ++i) {
			String s = null;
			if (Buttons.feliz) {
				try {
					s = choose(new File("txt/Feliz.txt"));
					Fundo.Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (Buttons.triste) {
				try {
					s = choose(new File("txt/Triste.txt"));
					Fundo.Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (Buttons.motivacao) {
				try {
					s = choose(new File("txt/Motivacional.txt"));
					Fundo.Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (Buttons.pergunta) {
				try {
					s = choose(new File("txt/Pergunta.txt"));
					Fundo.Resultado = s;
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
					@SuppressWarnings("unused")
					Main window = new Main();
					Frames.frame.setVisible(true);
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
				Main.frase = line;

		}

		return Main.frase;

	}
	
	public static void Categoria() {
		JLabel lbsuafrase = new JLabel("Escolha a categoria da frase:",
				JLabel.CENTER);
		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbsuafrase.setBounds(142, 39, 325, 27);
		Frames.frameAdd.getContentPane().add(lbsuafrase);
		Frames.frameAdd.setVisible(true);

	}
}
