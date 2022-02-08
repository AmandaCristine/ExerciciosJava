package Lista1;

import java.util.Scanner;

public class Exercicio3 {
	
	//leia o tempo em segundos e mostre-o expresso em horas, minutos e segundos.//
	
	public static void main (String[] args) {
		
		int segundos, horas, minutos, TotalSegundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quantos segundos durou o evento na fabrica: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 300) / 60;
		TotalSegundos = (segundos % 3600) % 60;
		
		
		System.out.println("O evento durou: " +horas+ " hora(s) " +minutos+ " minuto(s) e " +TotalSegundos+ " segundo(s).");
		
		ler.close();
		
	}
	
	

}