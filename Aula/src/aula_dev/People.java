package aula_dev;

import java.util.Scanner;

public class People {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdMulheres = 0, qtdHomens = 0, sexo;
		float alt = 0, somaH = 0, maior = 0, menor = 0, mediaHomens;
		
		for (int i = 0; i < 3; i++) {

			System.out.println("Digite sua altura em cm: ");
			alt = sc.nextFloat();

			System.out
					.println("Digite a letra correspondente ao seu sexo. (1-Masculino, 2-Feminino, 3-Outros: ");
			sexo = sc.nextInt();

			if (sexo == 3) {
				System.out.println("");

			} else if (sexo == 1) {
				qtdHomens++;
				somaH = somaH + alt;

			} else if (sexo == 2) {
				qtdMulheres++;
			} else
				System.out.println("Opção sexo inválido!");
			
			if (alt > maior) {
				maior = alt;
			} if (alt < maior) {
				menor = alt;
		}
		
		}
		mediaHomens = somaH / qtdHomens;

		System.out.println("A maior altura do grupo é de: " + maior + "cm" + " e a menor é de: " + menor + "cm");
		System.out.println("A média de altura dos homens é: " + mediaHomens + "cm");
		System.out.println("O número de mulheres é: " + qtdMulheres);
		
		sc.close();
	}

}
