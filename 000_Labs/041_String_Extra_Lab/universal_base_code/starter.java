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
		System.out.println("Please enter a sentence: ");
		String sentence = sc.nextLine();
		String finalSent = "";
	while(true){
	if(sentence.indexOf(" ")==-1){
				finalSent = sentence+" "+finalSent;
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			sentence = sentence.substring(space+1);
			finalSent = word+" "+finalSent;
		}
		System.out.println(finalSent);
	}
			
	}


