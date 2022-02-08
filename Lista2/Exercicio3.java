package Lista2;

import java.util.Scanner;

public class Exercicio3 {
	
	/*Solicitar a idade de várias pessoas e imprimir:
	  Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
	  O programa termina quando idade for =99.
	*/
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int menor21 = 0, maior50 = 0, digite = 0;
		
		while(digite != 99){
			
			System.out.println("Informe sua idade: " );
			digite = ler.nextInt();
			
			if(digite < 21){
				
				menor21++;				
			}
			
			if(digite >50) {
				
				maior50++;
			}
			
		}
		
		System.out.println("\nO Total de pessoas com menos de 21 anos: " +menor21+ 
				"\nO total de pessoas com mais de 50 anos: " +maior50);
		
		ler.close();
		
	}
}
