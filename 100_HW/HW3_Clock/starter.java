/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of the week: ");
		int num = sc.nextInt();
		
		int Sunday = 0;
		int Monday = 1;
		int Tuesday = 2;
		int Thursday = 4;
		int Friday = 5;
		int Saturday = 6;
		
		if(num==0)
			System.out.print("It's the weekend, wake up its 10 am");
				
		if(num==6)
			System.out.print("It's the weekend, wake up its 10 am");
		else
		System.out.print("Its the weekday, wake up its 7 am");
	}
}
