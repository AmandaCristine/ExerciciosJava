package Lista2;

public class Exercicio1 {
	
	//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.//
	
	public static void main (String[] args) {
		
		System.out.println("Os número que divididos por 11 com resto = 5, são: " );
		
		for(int i=1000; i<=1999; i ++) {
			
			if(i%11 == 5) {
				
				System.out.println(i);
			}
			
			
		}
		
		
		
	}
	

}
