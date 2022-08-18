package aula_dev;

import java.util.Scanner;

public class Maior_e_segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int x;
		int segundo = 0;
		int menor = 0;

		for (int i = 0; i <= 10; i++) {
			System.out.println("Digite os valores: ");
			x = sc.nextInt();

			if (x > maior) {
				maior = x;
			}
			
			if (x > menor && x < maior) {
				menor = x;
			}

		}
		System.out.println("O maior valor digitado é: " + maior);
		System.out.println("O segundo maior valor digitado é: " + menor);
	}

}
