/*
 *	Author:  Solomon Kim
 *  Date:  9/11
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();  
		
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What is your birth month?");
		String month = sc.nextLine();
		
		System.out.println("What is your birth day?");
		String day = sc.nextLine();
		
		System.out.println("What is your birth year?");
		String year = sc.nextLine();
		sc.nextLine();
		
		System.out.println("How much is a buck fifty?");
		int buck= sc.nextInt();
		
	}
}
