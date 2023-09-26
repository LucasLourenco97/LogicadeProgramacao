package programa1;

import java.util.Scanner;

public class ResultadoaoQuadradoeaoCubo {

	//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor que será convertido ao quadro(^2) e ao cubo(^3): ");
		double valorDigitado = entrada.nextDouble();
		
		System.out.println("\n O valor ao quadrado é igual a: " + Math.pow(valorDigitado, 2) + 
				"\n\n O valor ao cubo é igual a: " + Math.pow(valorDigitado, 3));
		entrada.close();
	
	}
}
