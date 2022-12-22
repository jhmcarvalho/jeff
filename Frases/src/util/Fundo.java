package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import frases.ViewFrases;

public class Fundo {
	
public static JTextArea Result;

	
	public static void Fundo() {
		
		ViewFrases view = new ViewFrases();
		
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
		Result.setText(view.Resultado);
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
