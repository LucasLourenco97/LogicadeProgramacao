package programa1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperaturaCelciusFahrenheit {
	
	//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
   // Formula F = 1,8*C + 32

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor em Celcius: ");
		String Celcius = scanner.next().replace(",", ".");
		Double ValorCelcius = Double.parseDouble(Celcius);
		
		double Resultado = 1.8 * ValorCelcius + 32;
		
		DecimalFormat formato = new DecimalFormat("0.00");
		String TemperaturaFormatada = formato.format(Resultado);
		
		System.out.println("O resultado em Fahrenheit é igual a: " + TemperaturaFormatada);
		scanner.close();
	}
}
