package multiplos;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		Scanner B = new Scanner(System.in);
		int x;
		int y;
		System.out.println("Digite o valor A: ");
		x = A.nextInt();
		System.out.println("Digite o valor B: ");
		y = B.nextInt();
		if (x > y && x % y == 0) {
			System.out.println("São Múltiplos");
		} else if (y > x && y % x == 0 ) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}
		
		A.close();
		B.close();
	}

}
