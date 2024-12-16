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
		System.out.print("Please enter your first number: ");
		int num = sc.nextInt();
		System.out.print("Please enter your second number: ");
		int num2 = sc.nextInt();
		System.out.print("Please enter your third number: ");
		int num3 = sc.nextInt();
		
		if((num>num2)&&(num>num3)){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("Number was "+num);
		}
		if((num2>num)&&(num2>num3)){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("Number was "+num2);
		}
		if((num3>num)&&(num3>num2)){
			System.out.println("Your third number is the largest of the three!");
			System.out.println("Number was "+num3);
		}
		if((num<num2)&&(num<num3)){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("Number was "+num);
	}
	if((num2<num3)&&(num2<num)){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("Number was "+num2);
	}
	if((num3<num2)&&(num3<num)){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("Number was "+num3);
	}
}
}