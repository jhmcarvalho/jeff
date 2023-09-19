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

        for (int i = 0; i < 6; i++) {
            // Gera um número aleatório entre 0 e 99.
            int numero = random.nextInt(60) + 1;      

            // Formata o número para ter dois dígitos.
            String numeroFormatado = String.format("%02d", numero);

            // Adiciona o número à string final.
            resultado.append(numeroFormatado);

            // Adiciona um traço se não for o último número.
            if (i < 5) {
                resultado.append("-");
            }
            resultado2 = "Seu número da sorte é: " + resultado.toString();
           // System.out.println(resultado2);
        }

        return resultado.toString();
    }
}