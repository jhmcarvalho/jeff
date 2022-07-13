package frases;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewFrases {

	private JFrame frame;
	private JTextField txtFrases;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public ViewFrases() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSuaFraseDo = new JLabel("SUA FRASE DO DIA \u00C9:");
		lblSuaFraseDo.setBounds(156, 33, 212, 27);
		frame.getContentPane().add(lblSuaFraseDo);
		txtFrases = new JTextField();
		txtFrases.setBounds(21, 77, 392, 41);
		frame.getContentPane().add(txtFrases);
		txtFrases.setColumns(10);
		txtFrases.setEditable(false);
		txtFrases.setBackground(Color.LIGHT_GRAY);

		JButton btnNovaFrase = new JButton("Nova Frase");
		btnNovaFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			//	if (txtFrases.getText() != null) {
						//JOptionPane.showMessageDialog(null, +result);
				//	} else {
				//		JOptionPane.showMessageDialog(null,
				//					"Sua frase não pode ser gerada");
				//		}

			}
		});
		btnNovaFrase.setBounds(44, 192, 123, 27);
		frame.getContentPane().add(btnNovaFrase);

		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int retorno = JOptionPane.showConfirmDialog(null,
						"Deseja sair?", " ", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);

				if (retorno == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSair.setBounds(242, 192, 126, 27);
		frame.getContentPane().add(btnSair);
	}

	// public boolean checkFrases(String frases){
	// return frases.equals("frases");
 }
	
	
	