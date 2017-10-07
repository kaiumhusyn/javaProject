package Java;

import java.util.Scanner;

public class Iflse {
	static int roll;
	static Scanner number = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		roll=number.nextInt();
		if(roll%2==0){
			System.out.println("Wired");
		}
		else{
			System.out.println("Not Wired");
		}
	}
	}
		

