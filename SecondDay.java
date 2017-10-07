package Java;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout;

import org.omg.PortableServer.ServantActivator;

public class SecondDay {
	
	static Scanner scan= new Scanner(System.in);
	static int[] a = {344546456,345,34,34,45};
	static String[] b = {"2", "3","4"};
	static int[] rolls = new int[10]; 
	//static int a1 = 34;
   
	

	public static void main(String[] args) {
	
		
	 for(int i=0; i<rolls.length; i++){
		 //System.out.println( a[i]);
		 //System.out.println(b[i]);
		 rolls[i]=scan.nextInt();	 
	 }
	 
	 for(int i=0; i<rolls.length; i++) {
		 System.out.println(rolls[i]);
	 }
		

	}

}
