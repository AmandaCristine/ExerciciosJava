package ListaExtra1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		
		int[][] matrizTrans = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = 2;
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = 4;
			}
		}

		int operador = ler.nextInt();

		switch (operador) {
		case 1:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizTrans[i][j] = matriz2[i][j] + matriz1[i][j];
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matrizTrans[i][j]);
				}
			}
			break;
			
		case 2:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizTrans[i][j] = matriz2[i][j] - matriz1[i][j];
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matrizTrans[i][j]);
				}
			}
			break;
			
		case 3:
			System.out.print("Informe o valor: ");
			int num = ler.nextInt();
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matriz2[i][j] = matriz2[i][j] + num;
					matriz1[i][j] = matriz1[i][j] + num;
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz1[i][j]);
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz2[i][j]);
				}
			}
			
			break;
		case 4:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz1[i][j]);
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println(matriz2[i][j]);
				}
			}
			break;

		}
		
		ler.close();
	}
}