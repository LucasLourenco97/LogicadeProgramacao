package Graus;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	    public static void main(String[] args) {
	        // F�rmula para converter Fahrenheit para Celsius: (�F - 32) x 5/9

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor em Fahrenheit que deseja converter:");
	        String fahrenheit = scanner.nextLine();

	        double F = Double.parseDouble(fahrenheit);
	        final double x = 32;
	        final double fator = 5.0 / 9.0;
	        final double Celsius = (F - x) * fator;
	        System.out.println("A temperatura convertida � igual a " + Celsius + " �C");

	        scanner.close();

	    }
}
