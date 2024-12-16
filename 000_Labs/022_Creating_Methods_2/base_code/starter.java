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
	
	System.out.println("What is your base number?");
	int base = sc.nextInt();
	System.out.println("What is your exponent number?");
	int expo = sc.nextInt();
	
	int finalans = pow(base, expo);
	System.out.print(finalans);

		
	}
	
	public static int pow(int base1, int expo1){
		int count = 1;
		while(expo1>0){
			count*=base1;
			expo1--;
		}
		return count;
	}
}
