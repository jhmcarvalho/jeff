package aula_dev;

import java.util.Scanner;

public class Maior_numero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int x;
		
		for (int i = 0; i <= 10; i++){
			System.out.println("Digite os valores: ");
			x = sc.nextInt();
			if (x > maior){
				maior = x;
			}
			
		}
		System.out.println("O maior valor digitado é: " + maior);

	}

}
