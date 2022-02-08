package ListaExtra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int operador = 0;
		String fruta = null;

		List<String> frutas = new ArrayList<>();

		System.out.println("Bem Vindo ao Estoque");

		do {
			System.out.println("\n    ESTOQUE");
			System.out.println("(1) Adicionar");
			System.out.println("(2) Remover");
			System.out.println("(3) Consultar");
			System.out.println("(0) Sair");
			System.out.println("------------");
			System.out.print("Digite aqui: ");
			operador = ler.nextInt();

			switch (operador) {
			case 1: {
				System.out.println("\nAdicionar");
				do {
					System.out.println("\n(1) Adicionar fruta:");
					System.out.println("(0) Sair");
					System.out.println("------------");
					System.out.print("Digite aqui: ");

					operador = ler.nextInt();

					switch (operador) {
						case 1: {
							System.out.print("\nNome da fruta: ");
							fruta = ler.next();
							frutas.add(fruta.toLowerCase());
							System.out.println("\nFruta " + fruta + " adicionada.");
							break;
						}
						case 0: {
							System.out.println("Retornando ao menu.");
							break;
						}
						default:
							System.out.println("\nErro! Opção inválido! Tente utilizar:");
							
					}
				} while (operador != 0);
				operador = 1;
				break;
			}
			case 2: {
				System.out.println("\nRemover");
				do {
					System.out.println("\n(1) Remover fruta:");
					System.out.println("(0) Sair");
					System.out.println("------------");
					System.out.print("Digite aqui: ");
					
					operador = ler.nextInt();
					
					switch (operador) {
					case 1: {
						System.out.print("\nNome da fruta: ");
						fruta = ler.next();
						
						if(frutas.contains(fruta.toLowerCase())) {
							System.out.println("Tem a fruta");
							frutas.remove(fruta.toLowerCase());
							System.out.println("A fruta " + fruta + " foi removida.");
						}
						else {
							System.out.println("A fruta: " + fruta + " não tem no estoque.");
						}
						break;
					}
					case 0: {
						System.out.println("Retornando ao menu.");
						break;
					}
					default:
						System.out.println("\nErro! Opção inválido! Tente utilizar:");
					}
				}while(operador != 0);
				operador = 1;
				break;
			}
			case 3: {
				System.out.println("\nConsultar");
				do {
					System.out.println("\n(1) Consultar frutas:");
					System.out.println("(0) Sair");
					System.out.println("------------");
					System.out.print("Digite aqui--> ");
					
					operador = ler.nextInt();
					
					switch (operador) {
						case 1: {
							System.out.println("Todos os itens do estoque");
							for(String x: frutas) {
								System.out.println(x);
							}
						}
						case 0: {
							System.out.println("Retornando ao menu.");
						}
						default:
							if(operador != 0 && operador != 1) {
								System.out.println("\nErro! Opção inválido! Tente utilizar:");
							}
					}
					
				}while(operador != 0);
				operador = 10;
			}
			case 0: {
				if(operador == 0) {
					System.out.println("\n------------");
					System.out.println("Obrigada por acessar o estoque.");
				}
				break;
			}
			default:
				System.out.println("\nErro! Opção inválido! Tente utilizar:");
				System.out.print("(1) Adicionar");
				System.out.print("(2) Remover");
				System.out.print("(3) Consultar");
				System.out.println("(0) Sair");
			}
		} while (operador != 0);

		ler.close();
	}

}
