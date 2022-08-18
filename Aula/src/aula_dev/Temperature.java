package aula_dev;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double c, k, re, ra, f;
		
		System.out.println("Type the Celsius value: ");
		c = sc.nextDouble();
		
		k = c + 273.15;
		re = (c * 4) / 5;
		ra = ((c * 9) / 5) + 491.67;
		f = c * 1.8 + 32;
		
		System.out.println("The value of "+ c +" converted to Fahrenheit (F) is: " + f);
		System.out.println("The value of "+ c +" converted to Réaumur (RE) is: " + re);
		System.out.printf("The value of "+ c +" converted to Rankine (RA) is: " + "%.2f%n",ra);
		System.out.println("The value of "+ c +" converted to Kelvin is: " + k);
		

	}

}
