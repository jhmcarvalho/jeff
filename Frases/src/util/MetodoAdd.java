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

import frases.ViewFrases;

public class MetodoAdd {

	public static void MetodoAdd(String path) throws IOException {
		String frase = ViewFrases.NovaFrase.getText();
		if (!frase.isEmpty()) {
			if (ViewFrases.feliz) {
				try {
					FileWriter fw = new FileWriter("txt/Feliz.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (ViewFrases.triste) {
				try {
					FileWriter fw = new FileWriter("txt/Triste.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (ViewFrases.motivacao) {
				try {
					FileWriter fw = new FileWriter("txt/Motivacional.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (ViewFrases.pergunta) {
				try {
					FileWriter fw = new FileWriter("txt/Pergunta.txt", true);
					BufferedWriter conexao = new BufferedWriter(fw);
					conexao.write(frase);
					conexao.newLine();
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Frase salva com sucesso");
				ViewFrases.NovaFrase.setText(null);
			}
		} else
			JOptionPane.showMessageDialog(null, "Digite uma frase para salvar");

	}
	
	public static void AddFrase() {
		
		JLabel NovaF = new JLabel("Digite a nova frase:", JLabel.CENTER);
		NovaF.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 26));
		NovaF.setBounds(142, 39, 325, 27);
		Frames.frameNovaFrase.getContentPane().add(NovaF);
		Frames.frameNovaFrase.setVisible(true);
		ViewFrases.NovaFrase = new JTextArea();
		ViewFrases.NovaFrase.setLineWrap(true);
		ViewFrases.NovaFrase.setWrapStyleWord(true);
		ViewFrases.NovaFrase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ViewFrases.NovaFrase.setMargin(new Insets(5, 5, 5, 5));
		ViewFrases.NovaFrase.setBounds(21, 77, 610, 67);
		Frames.frameNovaFrase.getContentPane().add(ViewFrases.NovaFrase);
		ViewFrases.NovaFrase.setColumns(10);
		ViewFrases.NovaFrase.setEditable(true);
		ViewFrases.NovaFrase.setBackground(Color.WHITE);

	}
}
