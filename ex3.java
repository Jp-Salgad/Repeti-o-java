import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

		double num = 0, soma = 0, m�dia = 0;
		int cont = 1;
		
		System.out.println("Escreva 20 n�meros inteiros, que eu irei mostrar a soma e a m�dia deles.");
		
		System.out.println("Digite os 20 n�meros:");
		
		while ( cont <= 20) {
		System.out.printf("%dN:", cont);
		num = leitor.nextInt();
		++cont;
		
		soma = soma + num;
		m�dia = soma/20;
		
		}
		System.out.println("Soma:" +soma);
		System.out.println("M�dia:" +m�dia);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
}
