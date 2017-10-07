package Java;

import java.util.Scanner;

public class NestedConditions {
	static Scanner num = new Scanner(System.in);
	static int n;

	public static void main(String[] args) {
		n = num.nextInt();
		
		if(n%2 != 0){
			System.out.println("Weird");
		}
		else 
		{

			if(n>=2 && n<=5)
			{
				System.out.println("Not Weird");
			}
			else if(n>=6 && n<=20)
			{
				System.out.println("Weird");
			}
			else if(n>20)
			{
				System.out.println("Not Weird");
			}
			
		}
		
//		if(n%2 == 0)
//		{
//		}
//		
//		else 
//		{
//			System.out.println("Weird");
//		}

	}

}
