package Lista4.Exercicio1.application;

import Lista4.Exercicio1.entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cachorro = new Cachorro("Doguinho", 2);
		Animal cavalo = new Cavalo("Eguinha", 4);
		Animal preguica = new Preguica("Moleza", 5);
		
		
		System.out.println(cachorro.getNome() + ", " + cachorro.getIdade());
		cachorro.emitirSom();
		cachorro.mostraMovimento();
		
		System.out.println("\n" + cavalo.getNome() + ", " + cavalo.getIdade());
		cavalo.emitirSom();
		cavalo.mostraMovimento();
		
		System.out.println("\n" + preguica.getNome() + ", " + preguica.getIdade());
		preguica.emitirSom();
		preguica.mostraMovimento();
		
	}

}
