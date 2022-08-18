package aula_dev;

import java.util.Random;

public class Gerando_numeros {

	public static void main(String[] args) {
		int aleatorio = 0;
		Random random = new Random();
		for (int i = 1; i <= 20; i++) {
			aleatorio = random.nextInt(1000) + 1000;

			if (aleatorio % 11 == 5) {
				System.out.println(aleatorio);
			}

		}

	}

}