package programa1;

import java.util.Scanner;

public class Calculadora {

	// Ler numero 1 
	// Ler numero 2
	// + - * /
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
	
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
	
		System.out.println("Informe a operação: ");
		String op = entrada.next();
		
		//Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		

		
		
		System.out.printf("%.2f %s %.2f = %.2f ", num1, op, num2, resultado);
		entrada.close();
	
	}
}