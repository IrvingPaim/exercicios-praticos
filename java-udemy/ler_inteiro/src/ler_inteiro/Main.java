package ler_inteiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite um n�mero qualquer (Positivo, Nulo ou Negativo): ");
		x = sc.nextInt();
		if (x < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}
		sc.close();
	}

}
