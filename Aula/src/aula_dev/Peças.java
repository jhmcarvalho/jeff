package aula_dev;

import java.util.Scanner;

public class Peças {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor1, valor2, total1, total2;
		int cod1, cod2, qtd1, qtd2;

		System.out.println("Digite o código da primeira peça: ");
		cod1 = sc.nextInt();

		System.out.println("Digite a quantidade das peças 1: ");
		qtd1 = sc.nextInt();

		System.out.println("Digite o valor unitário da peça 1: ");
		valor1 = sc.nextDouble();

		System.out.println("\n**---------------------------------**\n");

		System.out.println("Digite o código da segunda peça: ");
		cod2 = sc.nextInt();

		System.out.println("Digite a quantidade das peças 2: ");
		qtd2 = sc.nextInt();

		System.out.println("Digite o valor unitário da peça 2: ");
		valor2 = sc.nextDouble();

		total1 = qtd1 * valor1;
		total2 = qtd2 * valor2;

		System.out.printf("O preço total das peças de código: " + cod1
				+ " é: %.2f%n", total1);
		System.out.printf("O preço total das peças de código: " + cod2
				+ " é: %.2f%n", total2);

	}

}
