/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		if(num>10){
			System.out.println("This number is greater than 10");
		}
		else{
			System.out.println("This number is not greater than 10");
		}
		
		System.out.println("Please enter another number");
		int num2 = sc.nextInt();
		
		if(num2>20){
			System.out.print("This number is greater than 20");
		}
		else{
			System.out.print("This number is not greater than 20");
		}
	}
}
