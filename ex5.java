import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
    
    double cc = 0;
    double sal�rio = 1, altura;
    String sexo;
    double m�dia, soma = 0, mm = 0, mn = 200;
    int cont = 1;
    
    do {
    	
    System.out.printf("Digite seu sexo (m/f)" , cont);
    sexo = leitor.next();
    System.out.printf("Digite o seu sal�rio, por favor:" ,cont);
    sal�rio = leitor.nextDouble();
    System.out.printf("Agora, por favor, digite a sua altura:" , cont);
    altura = leitor.nextDouble();
    cont++;
    
    soma = soma + sal�rio;
    m�dia = soma/2;
    
    if (altura > mm) {
    	mm = altura;
    }
    else if (altura < mn) {
    	mn = altura;
    }
    if (sal�rio <= 1000 && sexo == "f") {
    	cc = cc + 1;
		
    }
    }
    
    while (cont <= 2);
    
    System.out.println("A m�dia dos sal�rios �:" +m�dia);
    System.out.println("A maior altura �:" +mm+ "E a menor altura � de:" +mn);
    System.out.println("A quantidade de mulheres com sal�rio at� de R$1.000,00 � de:" +cc);
		
		
		
		
		
		
		
		
		
    
}
}