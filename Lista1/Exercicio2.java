package Lista1;

import java.util.Scanner;

public class Exercicio2 {
	
	//leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.//
	
	public static void main (String[] args) {
		
		int anos, meses, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua idade em dias: ");
		dias = ler.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias -= (anos * 365 + meses *30);
		
		
		System.out.println("A sua idade é de: " +anos+ " ano(s) " +meses+ " mês/meses e " +dias+ " dia(s).");
		
		ler.close();

	}
}
