package programa1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class indiceDeMassaCorporal {
	public static void main(String[] args) {
		
	
//	Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
//	divide-se o peso (em kg) pelo quadrado da altura (em metros) PESO/(ALTURA)2

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite sua altura: ");
	String altura = entrada.next().replace(",", ".");
	Double alturaDouble = Double.parseDouble(altura);
	
	System.out.println("Digite seu peso: ");
	String peso = entrada.next().replace(",", ".");
	Double pesoDouble = Double.parseDouble(peso);
		
	alturaDouble = Math.pow(alturaDouble, 2);
	
	double resultado = pesoDouble / alturaDouble;
	
	DecimalFormat formato = new DecimalFormat("0.00");
	String resultadoFormato = formato.format(resultado);
	
			
	System.out.println("Seu IMC (Indice de massa corporal) é igual a : " + resultadoFormato );
	
	entrada.close();
	
	}
}
