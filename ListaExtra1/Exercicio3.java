package ListaExtra1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		//matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		//int cont = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Entra o valor [" + i + "] [" + j + "]: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		int contador = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(matriz[i][j] > 10) {
					contador++;
				}
			}
		}
		
		System.out.println("Tem " + contador + " valor(es) que é/são maior(es) que 10.");
		
		leia.close();
	}

}
