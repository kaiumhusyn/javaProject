package Java;

import java.util.Scanner;

public class ThirdDay {
	
	static Scanner scan= new Scanner(System.in);
	static char [] baal = new char[5];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<baal.length; i++){
			baal [i]= scan.next().charAt(0);		
			}
		for(int i=0; i<baal.length; i++){
			
			System.out.println(baal[i]);
		}
	

	}

}
