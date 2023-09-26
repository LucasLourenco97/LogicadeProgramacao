package programa1;

import java.util.Scanner;

public class AreaDoTriangulo {

//	Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
// area = base/2

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		//Aqui eu armazeno o valor da altura do triângulo usando o metodo scanner 
		System.out.println("Digite o valor da altura");
		double valorAltura = entrada.nextDouble();
		
		//Aqui eu armazeno o valor da base do triângulo usando o metodo scanner 
		System.out.println("Digite o valor da base");
		double valorBase = entrada.nextDouble();

		//Aqui eu multiplico e divido por 2 para gerar o resultado desejado
		System.out.println("A área do triangulo é equivalente a " + valorAltura * valorBase / 2.0);
		entrada.close();
		
	}
}
