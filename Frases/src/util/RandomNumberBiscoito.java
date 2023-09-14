package util;

import java.awt.Font;
import java.util.Random;

import javax.swing.JLabel;

public class RandomNumberBiscoito {
	public static String resultado2;

	public static String gerarNumerosAleatorios() {
        Random random = new Random();
        StringBuilder resultado = new StringBuilder();
        JLabel label = new JLabel();
        
//        JLabel lbNumeroBiscoito = new JLabel();
//		lbNumeroBiscoito.setText(RandomNumberBiscoito.resultado2);
//		lbNumeroBiscoito.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
//		lbNumeroBiscoito.setBounds(10, 02, 525, 27);
//		System.out.println(RandomNumberBiscoito.resultado2);
//		Frames.frame.getContentPane().add(lbNumeroBiscoito);

        for (int i = 0; i < 6; i++) {
            // Gere um número aleatório entre 0 e 99.
            int numero = random.nextInt(100);

            // Formate o número para ter dois dígitos.
            String numeroFormatado = String.format("%02d", numero);

            // Adicione o número à string final.
            resultado.append(numeroFormatado);

            // Adicione um traço se não for o último número.
            if (i < 5) {
                resultado.append("-");
            }
            resultado2 = "Seu número da sorte é: " + resultado.toString();
           // System.out.println(resultado2);
        }

        return resultado.toString();
    }
}