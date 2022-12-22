package util;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import frases.ViewFrases;

public class Mape {

	public void Mapeamento(String tipo) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 1; ++i) {
			String s = null;
			String Resultado;
			if (tipo == "feliz") {
				try {
					s = choose(new File("C:/Dev/jeff/Frases/txt/Feliz.txt"));
					Resultado = s;
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (!map.containsKey(s))
				map.put(s, 0);
			map.put(s, map.get(s) + 1);
			System.out.println(s);
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
		String frase = null;
		for (Scanner sc = new Scanner(f); sc.hasNext();) {
			++n;
			String line = sc.nextLine();
			if (Rand.nextInt(n) == 0)
				frase = line;

		}

		return frase;
		
	}
}
