package Lista4.Exercicio1.entities;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	
	public void emitirSom(){
		System.out.println("\nArghh");
	}
	
	@Override
	
	public void mostraMovimento(){
		System.out.println("\nEscalar");
		
	}
	

}
