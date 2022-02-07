package Lista4.Exercicio1.entities;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	
	public void emitirSom(){
		System.out.println("\nAU AU");
	}
	
	@Override
	
	public void mostraMovimento(){
		System.out.println("\nCorre");
		
	}
	

}