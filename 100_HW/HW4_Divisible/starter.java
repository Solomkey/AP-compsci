/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int num = sc.nextInt();
		System.out.println("Please enter an integer:");
		int num2 = sc.nextInt();
		
		if(num%2==0){
			System.out.println(num+" is divisible by 2!");
		}
		else
		System.out.println(num+" is not divisible by 2!");
		
		if(num%3==0){
			System.out.println("This number is divisible by 3!");
		}
		if(num%4==0){
			System.out.println("This number is divisible by 4!");
		}
		if(num%5==0){
			System.out.println("This number is divisible by 5!");
		}
		
		if((num%5>=1)&&(num%3>=1)&&(num%4>=1)){
			System.out.println("This number is not divisible by 3, 4, or 5!");
			
			
			
		}
			if(num2%2==0){
			System.out.println(num2+" is divisible by 2!");
		}
		else
		System.out.println(num2+" is not divisible by 2!");
		
		if(num2%3==0){
			System.out.println("This number is divisible by 3!");
		}
		if(num2%4==0){
			System.out.println("This number is divisible by 4!");
		}
		if(num2%5==0){
			System.out.println("This number is divisible by 5!");
		}
		
		if((num2%5>=1)&&(num2%3>=1)&&(num2%4>=1)){
			System.out.println("This number is not divisible by 3, 4, or 5!");
		}
		
		}
		}
		
		
	

