package Java;

import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class pratic2 {
	static int roll;
	static Scanner scan= new Scanner (System.in);
	 

	public static void main(String[] args) {
	  roll =scan.nextInt();
		if(roll==150){
			System.out.println("Are Bolod Ato Student Ki 1Ta Class e Thake??");
		}
		else if (roll==2){
			System.out.println("B");
		}
		else if (roll==5){
			System.out.println("fuck");
		}
		else {
			System.out.println("Baal Falaite Roll Khujo?? :|");
		}

	}

}
