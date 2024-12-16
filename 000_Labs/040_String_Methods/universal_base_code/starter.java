/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String word = sc.nextLine();
		
		int x = word.indexOf(" ");
		System.out.print(word.substring(x+1, word.length()));
		
		


		
	}
}
