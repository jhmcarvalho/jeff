package aula_dev;

import java.util.Scanner;

public class Xuxa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd;
		int i;

		System.out
				.println("Digite a quantidade de patinhos que foram passear: ");
		qtd = sc.nextInt();

		for (i = qtd; i <= qtd; i--) {
			if (i == 1) {
				System.out.println(i + " patinho foi passear \n"
						+ "Além das montanhas \n" + "Para brincar \n"
						+ "A mamãe gritou: Quá, quá, quá, quá \n"
						+ "Mas nenhum patinho voltou de lá. \n");
			}

			if (i == 2) {
				System.out.println(i + " patinho foi passear \n"
						+ "Além das montanhas \n" + "Para brincar \n"
						+ "A mamãe gritou: Quá, quá, quá, quá \n" + "Mas só "
						+ (i - 1) + " patinho voltou de lá. \n\n");
			}

			if (i > 2) {
				System.out
						.println(i
								+ " patinhos foram passear \n"
								+ "Além das montanhas \n"
								+ "Para brincar \n"
								+ "A mamãe gritou: Quá, quá, quá, quá \n"
								+ "Mas só "
								+ (i - 1)
								+ " patinhos voltaram de lá. \n\n"
								+ "**------------------------------------------------**\n");

			}

			if (i == 0) {
				System.out.println("A mamãe patinha foi procurar \n"
						+ "Além das montanhas \n" + "Na beira do mar \n"
						+ "A mamãe gritou: Quá, quá, quá, quá \n" + "E os "
						+ qtd + " patinhos voltaram de lá."

				);
			}

		}
	}

}
