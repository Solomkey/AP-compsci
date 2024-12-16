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
	int Prime1 = sc.nextInt();
	printPrimes(Prime1);

	}
	public static boolean checkPrime(int Prime){
		int num = 2;
		while(num<Prime){
			if(Prime%num==0){
			return false;
			}
		num++;
		}
		return true;
	}
	 public static void printPrimes(int x){
        int y = 2;
         while(y<x){
            if(checkPrime(y)==true){
                System.out.println(y+" is a prime number.");
            }
            y++;
}
}
}