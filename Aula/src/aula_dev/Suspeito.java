package aula_dev;

import java.util.Scanner;

public class Suspeito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int p1, p2, p3, p4, p5;

		System.out.println("Telefonou para vítima? 1-SIM | 2-NÃO");
		p1 = sc.nextInt();

		System.out.println("Esteve no local do crime? 1-SIM | 2-NÃO");
		p2 = sc.nextInt();

		System.out.println("Mora perto da vítima? 1-SIM | 2-NÃO");
		p3 = sc.nextInt();

		System.out.println("Devia para a vítimaa? 1-SIM | 2-NÃO");
		p4 = sc.nextInt();

		System.out.println("Já trabalhou com a vítima? 1-SIM | 2-NÃO");
		p5 = sc.nextInt();

		if (p1 == 1) {
			contador++;
		}
		if (p2 == 1) {
			contador++;

		}
		if (p3 == 1) {
			contador++;

		}
		if (p4 == 1) {
			contador++;

		}
		if (p5 == 1) {
			contador++;
		}
		System.out.println(contador);
		if (contador == 2) {
			System.out.println("Suspeito");

		} else if (contador == 3 || contador == 4) {
			System.out.println("Cúmplice");

		} else if (contador == 5) {
			System.out.println("Assassino");

		} else {
			System.out.println("Inocente");
		}
	}

}
