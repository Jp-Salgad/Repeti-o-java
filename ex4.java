import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);


		int num;
		int cont = 1;
		int mm = 0;
		
		
		
		System.out.println("Digite os 15 números:");
		
		
		do {
			
			System.out.printf("%dN:", cont);
		num = leitor.nextInt();
		++cont;
		
		
		if ( num > mm) {
			mm = num;
		}
		
		}
while ( cont <= 15);
		System.out.println("Maior número digitado:" +mm);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
}