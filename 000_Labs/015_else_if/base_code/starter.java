/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		int y = ((int)(Math.random()*1000)+1);
		
		if(num==y){
			System.out.print("You are correct! Number was "+num);
		}
		else if(num<y){
			System.out.print("You are incorrect. Your number was smaller than the number. The correct number was "+y);
		}
		else{
			System.out.print("You are incorrect. Your number was larger than the number. The correct number was "+y);
		}
	}
}
