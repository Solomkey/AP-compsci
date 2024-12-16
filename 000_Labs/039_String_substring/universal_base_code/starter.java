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
		System.out.print("Enter a word: ");
		String x = sc.nextLine();
		
		int y = 1;
		int i = 0;
		while(i<x.length()){
		System.out.print(i+" ");
		System.out.println(x.substring(i, y));
		i++;
		y++;
		}

		
	}
}
