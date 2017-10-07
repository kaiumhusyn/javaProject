package Java;

import java.util.Scanner;

public class Practic3 {  
	static Scanner read = new Scanner(System.in);
	static int i;

	public static void main(String[] args) {
		
		i=read.nextInt();
		if( i>0) {   
			System.out.println("number is positive");
			
		}
		else if (i<0){
			
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is zero");
		}
		

	}

}
