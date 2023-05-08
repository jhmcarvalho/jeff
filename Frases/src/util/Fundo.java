package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Fundo {
	public static int randomNum;
	public static int fonteRandom;
	public static String Resultado;

	public static JTextArea Result;

	public static void ImagemFundo() {
		JLabel label = new JLabel();
		// obtem e coloca a imagem dentro de uma BufferedImage
		BufferedImage img = null;

		try {
			Random rand = new Random();
			randomNum = rand.nextInt((10 - 1) + 1) + 1;
			// randomNum = 4;
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
		if (randomNum == 16) {
			Result.setBounds(340, 100, 487, 140);
		}

		try {
			Random rand = new Random();
			fonteRandom = rand.nextInt((8 - 1) + 1) + 1;
			// fonteRandom = 2;

			if (fonteRandom == 1) {
				Result.setFont(new Font("Colonna MT", Font.PLAIN, 25));
			} else if (fonteRandom == 2) {
				Result.setFont(new Font("Ink Free", Font.PLAIN, 24));
			} else if (fonteRandom == 3) {
				Result.setFont(new Font("Jokerman", Font.PLAIN, 20));
			} else if (fonteRandom == 4) {
				Result.setFont(new Font("Segoe Print", Font.PLAIN, 20));
			} else if (fonteRandom == 5) {
				Result.setFont(new Font("Arial", Font.PLAIN, 20));
			} else if (fonteRandom == 6) {
				Result.setFont(new Font("SimSun", Font.PLAIN, 25));
			} else if (fonteRandom == 7) {
				Result.setFont(new Font("Stencil", Font.PLAIN, 22));
			} else if (fonteRandom == 8) {
				Result.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
			}

			System.out.println(fonteRandom);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Result.setFont(new Font("Colonna MT", Font.PLAIN, 25));
		Result.setMargin(new Insets(5, 5, 5, 5));
		Result.setText(Resultado);
		Result.setColumns(10);
		Result.setEditable(false);
		Result.setBackground(new Color(0, 0, 0, 0));

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
