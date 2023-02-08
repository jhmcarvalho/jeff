package util;

import java.awt.Font;

import javax.swing.JLabel;

public class Inicio {
	public static void Inicio() {

		JLabel Hora = new JLabel(Horario.BoasVindas());
		Frames.frameInicio.setVisible(true);
		JLabel lbsuafrase = new JLabel(
				"Bem vindo ao programa gerador de frases diarias aperte OK para continuar");
		lbsuafrase.setVisible(true);
		Hora.setBounds(15, 3, 435, 37);
		Hora.setFont(new Font("Rockwell", Font.BOLD, 15));
		Hora.setVisible(true);
		Frames.frameInicio.getContentPane().add(Hora);

		lbsuafrase.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lbsuafrase.setBounds(87, 49, 935, 67);
		Frames.frameInicio.getContentPane().add(lbsuafrase);
		
	}
}
