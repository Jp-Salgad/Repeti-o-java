import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
    
    double cc = 0;
    double salário = 1, altura;
    String sexo;
    double média, soma = 0, mm = 0, mn = 200;
    int cont = 1;
    
    do {
    	
    System.out.printf("Digite seu sexo (m/f)" , cont);
    sexo = leitor.next();
    System.out.printf("Digite o seu salário, por favor:" ,cont);
    salário = leitor.nextDouble();
    System.out.printf("Agora, por favor, digite a sua altura:" , cont);
    altura = leitor.nextDouble();
    cont++;
    
    soma = soma + salário;
    média = soma/20;
    
    if (altura > mm) {
    	mm = altura;}
    
    if (altura < mn) {
    	mn = altura;}
    
    if (salário <= 1000 && sexo.contentEquals ("f")) {
    	cc = cc +1;}
    cc++;
    
    }

    while (cont <= 20);
    System.out.println("==============================");
    System.out.println("A média dos salários é:" +média);
    System.out.println("A maior altura é:" +mm+ " E a menor altura é de:" +mn);
    System.out.println("A quantidade de mulheres com salário até de R$1.000,00 é de:" +cc);
    System.out.println("==============================");	
		
		
		
		
		
		
		
		
    
    }
}
