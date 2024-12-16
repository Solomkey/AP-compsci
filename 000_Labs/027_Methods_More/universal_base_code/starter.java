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
		myCharacter skib = new myCharacter("Wizard", 2, 3, 4, 5);
		skib.myToString();
		boolean pleaseWork = skib.setAll("Wizard",2,3,4,5);
		System.out.println(pleaseWork);

		
	}
}
