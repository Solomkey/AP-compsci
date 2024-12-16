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
		System.out.println("Please enter another number");
		int num2 = sc.nextInt();
		
		if(num==num2){
			System.out.println("These numbers are equal");
		}
		else{
			System.out.print("These numbers are not equal");
		}
		
	}
}
