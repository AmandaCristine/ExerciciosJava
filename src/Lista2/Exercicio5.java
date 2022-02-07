package Lista2;

import java.util.Scanner;

public class Exercicio5 {
	
	/*leia um número do teclado até que encontre um	número igual a zero.
	  No final, mostre a soma dos números digitados.
	*/
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int digite = 0 , soma = 0;
		
		do {
			
			System.out.println("Digite os números que quiser: ");
			digite = ler.nextInt();
			
			soma += digite;
					
		}while(digite != 0);
		
		System.out.println("Essa é a soma dos números: " +soma);
		
		ler.close();
	}
	
}
