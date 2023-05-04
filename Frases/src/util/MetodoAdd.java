package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import main.Main;

public class MetodoAdd {


	
	public static void Add(String path, String tipo) throws IOException {
		String frase = Main.NovaFrase.getText();
		if (!frase.isEmpty()) {
			if (tipo == "feliz") {
				try {
					FileWriter fw = new FileWriter("txt/Feliz.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (tipo == "triste") {
				try {
					FileWriter fw = new FileWriter("txt/Triste.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (tipo == "motivacao") {
				try {
					FileWriter fw = new FileWriter("txt/Motivacional.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (tipo == "pergunta") {
				try {
					FileWriter fw = new FileWriter("txt/Pergunta.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			JOptionPane.showMessageDialog(null, "Frase salva com sucesso");
			Main.NovaFrase.setText(null);
		} else
			JOptionPane.showMessageDialog(null, "Digite uma frase para salvar");

	}
	
	public static void AddFrase() {
		
		JLabel NovaF = new JLabel("Digite a nova frase:", JLabel.CENTER);
		NovaF.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 26));
		NovaF.setBounds(142, 39, 325, 27);
		Frames.frameNovaFrase.getContentPane().add(NovaF);
		Frames.frameNovaFrase.setVisible(true);
		Main.NovaFrase = new JTextArea();
		Main.NovaFrase.setLineWrap(true);
		Main.NovaFrase.setWrapStyleWord(true);
		Main.NovaFrase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		Main.NovaFrase.setMargin(new Insets(5, 5, 5, 5));
		Main.NovaFrase.setBounds(21, 77, 610, 67);
		Frames.frameNovaFrase.getContentPane().add(Main.NovaFrase);
		Main.NovaFrase.setColumns(10);
		Main.NovaFrase.setEditable(true);
		Main.NovaFrase.setBackground(Color.WHITE);

	}
}
