package programa1;

import java.util.Scanner;

//Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
//utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta


public class EquaçãodoSegundoGrau {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");

		System.out.println("\nDigite o valor de (a): " );
		int a = entrada.nextInt();
		
		System.out.println("\nDigite o valor de (b): " );
		int b = entrada.nextInt();

		System.out.println("\nDigite o valor de (c): " );
		int c = entrada.nextInt();

		double delta = (Math.pow(b, 2)) - (4 * a * c);
		
		System.out.println("\n O Valor do Delta é " + delta);
		
		double xLinha = ((- b + Math.sqrt(delta)) / (2.0 * a));
		
		double xDuasLinhas = ((- b - Math.sqrt(delta)) /(2.0 * a));
System.out.println("O x linha é " + (xLinha) + " o x 2 linha é: " + (xDuasLinhas));
		
		entrada.close();
	}
}
