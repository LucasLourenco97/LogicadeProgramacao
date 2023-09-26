package programa1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperaturaFahrenheitCelcius {

	public static void main(String[] args) {
		
	
//	Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
//	fórmula C=5/9. (F-32)
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o valor Fahrenheit: ");
	String TemperaturaFahrenheit = scanner.next().replace(",", ".");
	Double TemperaturaFahrenheit1 = Double.parseDouble(TemperaturaFahrenheit);

	
	double fatorConversao = 5.0/9.0;
	double formulaTemperaturaParaCelcius =  (TemperaturaFahrenheit1 - 32) * fatorConversao;
	
	DecimalFormat formato = new DecimalFormat("0.00");
	String TemperaturaFormatada = formato.format(formulaTemperaturaParaCelcius);

	
System.out.println("O valor convertido para celcius é: " + TemperaturaFormatada);
		
			scanner.close();
	}
}
