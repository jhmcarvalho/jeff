package aula_dev;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho;
		System.out.println("Digite o tamanho do quadrado:  ");
		tamanho = sc.nextInt();
		
		int i = 1;
		while (i <= tamanho*tamanho){
			if (i % tamanho == 0){
				System.out.printf("*\n");
			}else
				System.out.printf("*");
			i++;
		}

	}

}
 