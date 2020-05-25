import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

		double num = 0, soma = 0, média = 0;
		int cont = 1;
		
		System.out.println("Escreva 20 números inteiros, que eu irei mostrar a soma e a média deles.");
		
		System.out.println("Digite os 20 números:");
		
		while ( cont <= 20) {
		System.out.printf("%dN:", cont);
		num = leitor.nextInt();
		++cont;
		
		soma = soma + num;
		média = soma/20;
		
		}
		System.out.println("Soma:" +soma);
		System.out.println("Média:" +média);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
}
