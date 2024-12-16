/*
 *	Author:  Solomon
 *  Date:  9/11
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter degrees in Fahrenheit");
	double f = sc.nextDouble();
	
	System.out.println("Here is that converted into Celsius");
	System.out.print((f-32.0)*5.0/9.0);
	}
}
