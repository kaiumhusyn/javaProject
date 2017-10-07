package Java;

import java.util.Scanner;

public class Array {
	
	static Scanner num = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = num.nextInt();
		int arr []= new int[a];
		
		
		for(int i=0; i<a; i++){
			arr[i] = num.nextInt();
		
		}
		for(int i=0; i<a; i++){
			System.out.println(arr[i]);
		}
		
		
    
	}
	

}


