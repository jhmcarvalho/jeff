package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.text.StyledDocument;

public class Fundo {
	public static int randomNum;
	public static int fonteRandom;
	public static String Resultado;
	public static JFrame janela;
	public static ImageIcon imageIcon;
	public static BufferedImage img;
	public static int num;
	public static JLabel imgFundo;
	public static int height = 960;
	public static int width = 582;

	public static void ImagemFundo() {
		imgFundo = new JLabel();
		// obtem e coloca a imagem dentro de uma BufferedImage
		BufferedImage img = null;

		try {
			Random rand = new Random();
			randomNum = rand.nextInt((10 - 1) + 1) + 1;
			randomNum = 22;
			img = ImageIO.read(new File("img/Fundo" + randomNum + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		// // Cria e configura o texto no JLabel
		imgFundo.setFont(new Font("Calibri", Font.BOLD, 100));
		imgFundo.setForeground(Color.white);
		imgFundo.setHorizontalAlignment(SwingConstants.CENTER);
		imgFundo.setBounds(0, 0, width, height);

		janela = new JFrame();
		janela.setBounds(600, 0, width, height);
		janela.setSize(width, height);
		janela.getContentPane().setLayout(null);

		int tamanhoMaximo = 20;

	        // Dividir o texto em partes
	        String[] palavras = Resultado.split("\\s+");
	        StringBuilder sb = new StringBuilder();
	        String parteAtual = "";

	        for (String palavra : palavras) {
	            if (parteAtual.length() + palavra.length() <= tamanhoMaximo) {
	                parteAtual += palavra + " ";
	            } else {
	                sb.append(parteAtual.trim()).append("<br>");
	                parteAtual = palavra + " ";
	            }
	        }

	        if (!parteAtual.isEmpty()) {
	            sb.append(parteAtual.trim());
	        }

	        String html = "<html><body style='line-height: 1.5; text-align: center;'>" +
	                sb.toString() + "</body></html>";

	        // Criar uma JLabel com o texto formatado
	        JLabel jLabel = new JLabel(html);
	        jLabel.setBounds(20, 100, 520, 640);
	       // jLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	        jLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
	        jLabel.setForeground(Color.WHITE);
	        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        
	       janela.getContentPane().add(jLabel);


		try {
			Random rand = new Random();
			fonteRandom = rand.nextInt((7 - 1) + 1) + 1;
			 fonteRandom = 7;

			if (fonteRandom == 1) {
				jLabel.setFont(new Font("Colonna MT", Font.PLAIN, 44));
			} else if (fonteRandom == 2) {
				jLabel.setFont(new Font("Ink Free", Font.PLAIN, 40));
			} else if (fonteRandom == 3) {
				jLabel.setFont(new Font("Jokerman", Font.PLAIN, 40));
			} else if (fonteRandom == 4) {
				jLabel.setFont(new Font("Segoe Print", Font.PLAIN, 28));
			} else if (fonteRandom == 5) {
				jLabel.setFont(new Font("SimSun", Font.PLAIN, 30));
			} else if (fonteRandom == 6) {
				jLabel.setFont(new Font("Stencil", Font.PLAIN, 30));
			} else if (fonteRandom == 7) {
				jLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 35));
			}
			//System.out.println("fonte" + fonteRandom);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Cria e configura a janela

		// Força a imagem a ficar do tamanho da janela
		Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

		imageIcon = new ImageIcon(dimg);
		imgFundo.setIcon(imageIcon);

		// Cria o botão de exportar imagem para jpg
		JButton btnExportarImg = new JButton("BOTAO");
		btnExportarImg.setBorderPainted(true);
		btnExportarImg.setContentAreaFilled(true);
		btnExportarImg.setBounds(470, 20, 70, 20);
		btnExportarImg.setHorizontalAlignment(SwingConstants.CENTER);
		btnExportarImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num++;
				Fundo.exportarJpg();
			}
		});

		// Mostra a janela e adiciona o label a ela
		janela.setVisible(true);
		// janela.add(Result);
		janela.add(imgFundo);
		janela.getContentPane().add(btnExportarImg);

	}

	public static void exportarJpg() {
		try {
			// Cria um BufferedImage a partir do JFrame
			int w = imgFundo.getWidth();
			int h = imgFundo.getHeight();
			BufferedImage image = new BufferedImage(w, h,
					BufferedImage.TYPE_INT_RGB);
			janela.setSize(imgFundo.getWidth(), imgFundo.getHeight());
			janela.paint(image.getGraphics());

			// Cria o diretório de destino, caso não exista
			File destino = new File("D:\\Dev\\jeff\\Frases\\exportados");
			if (!destino.exists()) {
				destino.mkdirs();
			}

			// Cria o arquivo .jpg no diretório de destino
			File arquivo = new File(destino, "Img " + num + ".jpg");
			ImageIO.write(image, "jpg", arquivo);
			System.out.println(num);
			System.out.println("Imagem exportada com sucesso para "
					+ arquivo.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}