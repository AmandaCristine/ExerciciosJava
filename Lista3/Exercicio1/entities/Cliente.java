package Lista3.Exercicio1.entities;

public class Cliente {
		
		/*Crie uma classe cliente e apresente os atributos e métodos referentes
		 esta classe, em seguida crie um objeto cliente, defina as instancias deste
		 objeto e apresente as informações deste objeto no console.
		 */
		
		private String nome;
		private String email;
		private String senha;
		private Double salario;
		
		public Cliente(String nome, String email, String senha, Double salario) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			this.salario = salario;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalario(Double salario) {
			this.salario = salario;
		}

		
	

}
