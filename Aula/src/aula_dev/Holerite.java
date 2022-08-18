package aula_dev;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Holerite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double horas, qtdhoras, salBruto, ir = 0.0, inss, fgts, totalDesc =0.0, salLiquido;
		int porcentIR = 0;

		System.out.println("Digite o valor por hora: ");
		horas = sc.nextDouble();
		

		System.out.println("Digite a quantidade de horas: ");
		qtdhoras = sc.nextDouble();

		salBruto = (horas * qtdhoras);

		if (salBruto <= 900.0) {
			ir = null;
		} else if (salBruto > 900.0 && salBruto <= 1500.00) {
			ir = (salBruto / 100) * 5;
			porcentIR = 5;

		} else if (salBruto > 1500.0 && salBruto <= 2500.00) {
			ir = (salBruto / 100) * 10;
			porcentIR = 10;

		} else if (salBruto > 2500.0) {
			ir = (salBruto / 100) * 20;
			porcentIR = 20;
		}
		inss = (salBruto / 100) * 10;
		fgts = (salBruto / 100) * 11;
		totalDesc = ir + inss;
		salLiquido = salBruto - totalDesc;
		
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		
		System.out.print("\r\n" + "|Salário Bruto:        " + formatter.format(salBruto) +"|"+ 
				"\r\n" + "|---------------------------------|" +
				"\r\n" + "|(-)IR(" + porcentIR + "%" + "):            " + formatter.format(ir) + "   |"+ 
				"\r\n" + "|(-)INSS(10%):         " + formatter.format(inss) +"  |"+ 
				"\r\n" + "|FGTS(11%):            " +formatter.format(fgts) +"  |"+ 
				"\r\n" + "|---------------------------------|" +
				"\r\n" + "|Total de descontos:   " + formatter.format(totalDesc) +"  |"+ 
				"\r\n" + "|Salário Líquido:      " + formatter.format(salLiquido) +"  |"
				);
	}

}
