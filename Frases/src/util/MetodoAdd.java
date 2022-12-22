package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import frases.ViewFrases;


public class MetodoAdd {
	
	String NovaFrase;
	boolean feliz;
	boolean triste;
	boolean motivacao;
	boolean pergunta;
	
	
	
	
	public void MetodoAdd(String path) throws IOException {
		ViewFrases addFrase = new ViewFrases();
		String frase = addFrase.NovaFrase.getText();
		if (feliz) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Feliz.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (triste) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Triste.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (motivacao) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Motivacional.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (pergunta) {
			try {
				FileWriter fw = new FileWriter(
						"C:/Dev/jeff/Frases/txt/Pergunta.txt", true);
				BufferedWriter conexao = new BufferedWriter(fw);
				conexao.write(frase);
				conexao.newLine();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(null, "Frase salva com sucesso");
		addFrase.NovaFrase.setText(null);
	}

}
