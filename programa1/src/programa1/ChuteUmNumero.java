import java.util.Random;
import java.util.Scanner;

public class ChuteUmNumero {

//	Escreva um programa que, ao iniciar gera um valor aleatório de 1 a 10 e 
//	permite que o usuário chute um número até que o valor aleatório gerado 
//	no início do programa seja chutado corretamente

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10) + 1;
		int numeroTentativas = 0;
				
		 while (true) {
				System.out.println("Tente advinhar o número (de 1 a 10)");
	            int palpite = entrada.nextInt();
	            numeroTentativas++;

	            if (palpite == numeroAleatorio) {
	                System.out.println("Parabéns! Você adivinhou o número em " + numeroTentativas + " tentativas.");
	                break;
	            } else if (palpite < numeroAleatorio) {
	                System.out.println("Tente um número maior.");
	            } else {
	                System.out.println("Tente um número menor.");
	            }
	        }
		
		entrada.close();
		
	}
}
