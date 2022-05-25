package par_impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite um númer qualquer: ");
		x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("O número digitado é PAR!!");
		} else {
			System.out.println("O número digitado é IMPAR!!");
		}
		
		sc.close();

	}

}
