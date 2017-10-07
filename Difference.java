package Java;

import java.util.Scanner;

public class Difference {
	static int A;
	static int B;
	static int C;
	static int D;
	static Scanner dif = new Scanner(System.in);

	public static void main(String[] args) {
		A = dif.nextInt();
		B = dif.nextInt();
		C = dif.nextInt();
		D = dif.nextInt();
		System.out.println("DIFERENCA = "+(A*B-C*D));
		
	}

}
