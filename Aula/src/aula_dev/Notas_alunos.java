package aula_dev;

import java.util.Arrays;
import java.util.Scanner;

public class Notas_alunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Digite a quantidade de alunos: ");
			int qtd = sc.nextInt();
			int[] notas = new int[qtd];
			int total = 0;

			for (int i = 0; i < qtd; i++) {
				System.out.print("Nota do aluno " + i + " : ");
				notas[i] = sc.nextInt();

			}

			int sum = Arrays.stream(notas).sum();
			System.out.println("Valor = " + sum / qtd);

		} finally {
			sc.close();
		}
	}
}
