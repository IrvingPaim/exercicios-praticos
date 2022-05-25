package pedido;

import java.util.Scanner;

public class pedido {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------");
		System.out.println("-----CÓDIGO----------ESPECIFICAÇÕES----------PREÇO-----");
		System.out.println("-------1------------Cachorro Quente---------R$ 4.00----");
		System.out.println("-------2------------X Salada----------------R$ 4.50----");
		System.out.println("-------3------------X Bacon-----------------R$ 5.00----");
		System.out.println("-------4------------Torrada Simples---------R$ 2.00----");
		System.out.println("-------5------------Refrigerante------------R$ 1.50----");
		System.out.println("-------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		
	}

}
