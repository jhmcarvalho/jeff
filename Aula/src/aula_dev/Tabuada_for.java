package aula_dev;

import java.util.Scanner;

public class Tabuada_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int qtd;
		
		System.out.println("Digite um número: ");
		valor = sc.nextInt();
		
		for (qtd = 1; qtd <= 10; qtd++){
			System.out.println(valor + "x" + qtd + " = " + valor*qtd);
		}

	}

}
