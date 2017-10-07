package Java;

import java.util.Scanner;

import javax.swing.text.html.HTMLWriter;

public class FirstDay {
static int roll;
static Scanner scanner= new Scanner(System.in);


	public static void main(String[] args) {
		roll=scanner.nextInt();
		
		//System.out.println(roll);
		
		if(roll==1){
			System.out.println("A");
		}
		else if(roll==2){
			System.out.println("B");
		}
		else if(roll==3){
			System.out.println("C");
		}
		else{
			System.out.println("Student Not Found");
		}
		

	}
	
	
	


}
