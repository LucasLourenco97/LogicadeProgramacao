import java.text.DecimalFormat;
import java.util.Scanner;

public class MeuSalarioPorHora {

	// Escreva um programa que retorne o valor de um funcionário com base no seu
	// salário mensal e
	// horas trabalhadas por mês

	// Este é o método principal que será executado quando o programa for iniciado.
	public static void main(String[] args) {

		// Criação de um objeto Scanner para ler a entrada do teclado.
		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que digite o valor do salário bruto e lê a entrada.
		System.out.println("Digite o valor do seu salário bruto: ");
		// A entrada é lida como uma string e, em seguida, a vírgula (se houver) é
		// substituída por ponto.
		String salarioBruto = entrada.next().replace(",", ".");
		// A string é convertida em um valor double.
		Double salarioBrutoDouble = Double.parseDouble(salarioBruto);

		// Solicita ao usuário que digite quantas horas ele trabalha por mês e lê a
		// entrada.
		System.out.println("\nDigite quantas horas você trabalha por mês: ");
		double horasMensal = entrada.nextDouble();

		// Solicita ao usuário que digite quantas horas extras ele trabalhou no mês e lê
		// a entrada.
		System.out.println("\nDigite quantas horas extras você trabalhou no mês: ");
		double horasExtras = entrada.nextDouble();

		// Cria um objeto DecimalFormat para formatar números com duas casas decimais.
		DecimalFormat formato = new DecimalFormat("0.00");

		// Calcula o valor das horas extras com base no salário bruto e nas horas
		// trabalhadas no mês.
		// A fórmula utilizada é (Salario/Horas trabalhadas) * 1.5
		double valorHorasExtras = salarioBrutoDouble / horasMensal * 1.5;

		// Formata o resultado das horas extras como uma string com duas casas decimais.
		String resultadoHorasExtras = formato.format(valorHorasExtras).replace(",", ".");
		// Converte a string formatada de volta para um valor double.
		Double resultadoHorasExtrasDouble = Double.parseDouble(resultadoHorasExtras);

		// Imprime o valor a ser recebido pelas horas extras e o valor bruto das horas
		// extras.
		System.out.println("\nO valor que você receberá pelo seu serviço extra em horas é: "
				+ resultadoHorasExtrasDouble + "\n\nE o somando, o valor bruto de horas extras será igual a: "
				+ resultadoHorasExtrasDouble * horasExtras);

		// Fecha o objeto Scanner para liberar recursos.
		entrada.close();
	}
}
