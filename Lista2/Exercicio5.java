package Lista2;

import java.util.Scanner;

public class Exercicio5 {
	
	/*leia um n�mero do teclado at� que encontre um	n�mero igual a zero.
	  No final, mostre a soma dos n�meros digitados.
	*/
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int digite = 0 , soma = 0;
		
		do {
			
			System.out.println("Digite os n�meros que quiser: ");
			digite = ler.nextInt();
			
			soma += digite;
					
		}while(digite != 0);
		
		System.out.println("Essa � a soma dos n�meros: " +soma);
		
		ler.close();
	}
	
}
