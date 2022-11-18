package pakage;

import java.util.Scanner;

public class iteraciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final int N = 10;
		
		for (int f = 1; f <= N; f++) {
			
			for (int e = 1; e <= f -1; e++) {
				System.out.print("#");

			}
			
			for (int a = 1; a <= N - f + 1; a++) {
				System.out.print("*");
			}
			
			System.out.println();
		}		
	}
}
