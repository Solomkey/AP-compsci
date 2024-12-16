/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	
	int secret = (int)(Math.random()+1001);
	
	
	while(true){
		System.out.println("Please enter a number");
		int guess = sc.nextInt();
		if(guess!=secret){
			System.out.println("That is not correct. Try again");
		}
		if(guess == secret){
			break;
		}
	}
	System.out.print("You are correct!");

		
	}
}
