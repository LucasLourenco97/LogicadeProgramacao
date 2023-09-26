package programa1;

import java.util.Scanner;

public class CalculadoraBurrice {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		double primeiroValor = entrada.nextDouble();

		System.out.println("Digite o segundo valor");
		double segundoValor = entrada.nextDouble();

		System.out.println("Digite a operação desejada entre (+)(-)(*)(/)(%): ");
		String operaçãoDesejada = entrada.next();

		double resultado = "+".equals(operaçãoDesejada) ? primeiroValor + segundoValor : 0;
		resultado = "-".equals(operaçãoDesejada) ? primeiroValor - segundoValor : resultado;
		resultado = "*".equals(operaçãoDesejada) ? primeiroValor * segundoValor : resultado;
		resultado = "/".equals(operaçãoDesejada) ? primeiroValor / segundoValor : resultado;
		resultado = "%".equals(operaçãoDesejada) ? primeiroValor % segundoValor : resultado;

		System.out.println("O resultado é igual a: \n" + resultado);
		entrada.close();
	}
}