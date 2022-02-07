package Lista3.Exercicio2.entities;

public class Aviao {
	
	/*Crie uma classe avião e apresente os atributos e métodos referentes
	  esta classe, em seguida crie um objeto avião, defina as instancias deste
	  objeto e apresente as informações deste objeto no console.
	 */
	
	private String nome;
	private String categoria;
	private String marca;
	private int lugares;
	
	public Aviao(String nome, String categoria, String marca, int lugares) {
		
		this.nome = nome;
		this.categoria = categoria;
		this.marca = marca;
		this.lugares = lugares;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}
	
	

}
