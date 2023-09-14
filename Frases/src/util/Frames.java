package util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frames {
	public static JFrame frame;
	public static JFrame frameAdd;
	public static JFrame frameNovaFrase;
	public static JFrame frameInicio;
	public static JFrame frameLogin;
	
	//Todos os Frames são criados aqui, por organização.
	public static JFrame AllFrames(){
		//"frame" é o principal, onde as frases são geradas.
	frame = new JFrame("Frase do dia");
	frame.getContentPane().setBackground(Color.WHITE);
	frame.setBounds(900, 100, 667, 250);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	frame.getContentPane().setBackground(new java.awt.Color(220, 230, 254));
	
	
	frameAdd = new JFrame("Frase do dia");
	frameAdd.setBounds(900, 100, 667, 250);
	frameAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameAdd.getContentPane().setLayout(null);
	frameAdd.getContentPane()
			.setBackground(new java.awt.Color(220, 230, 254));
	
	frameNovaFrase = new JFrame("Frase do dia");
	frameNovaFrase.getContentPane().setBackground(Color.WHITE);
	frameNovaFrase.setBounds(900, 100, 667, 250);
	frameNovaFrase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameNovaFrase.getContentPane().setLayout(null);
	frameNovaFrase.getContentPane().setBackground(new java.awt.Color(220, 230, 254));
	
	
	frameInicio = new JFrame("Frase do dia");
	frameInicio.setBounds(900, 100, 667, 250);
	frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameInicio.getContentPane().setLayout(null);
	frameInicio.getContentPane().setBackground(new java.awt.Color(220, 230, 254));
	
	frameLogin = new JFrame("Bem vindo(a) ao sistema!");
	frameLogin.getContentPane().setBackground(Color.WHITE);
	frameLogin.setBounds(900, 100, 567, 250);
	frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameLogin.getContentPane().setLayout(null);
	

	return null;
	}
}
