package Lista1;

import java.util.Scanner;

public class Exercicio1 {
	
	//leia a idade de uma pessoa expressa em anos, meses e	dias e mostre-a expressa apenas em dias//
	
	public static void main (String[] args) {
		
		int anos, meses, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua idade em anos: ");
		anos = ler.nextInt(); 
		
		System.out.println("Informe a sua idade em meses: ");
		meses = ler.nextInt();
		
		System.out.println("Informe a sua idade em dias: ");
		dias = ler.nextInt();
		
		anos = anos * 365;
		meses = meses * 30;
		dias = dias + anos + meses;
		
		System.out.println("A sua idade é de: " +dias+ " dias");
		
		ler.close();
	}

}
