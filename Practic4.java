package Java;

import java.util.Scanner;

public class Practic4 {
	static double PI=3.1416;
	static double r;
	static Scanner cir = new Scanner(System.in);

	public static void main(String[] args) {
		r= cir.nextDouble();
		
		System.out.println(PI*r*r);

	}

}
