/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog food = new Dog("food", 6000);
		Dog food2 = new Dog("German shepard", "food2");
		System.out.println(food.isSleeping());
		boolean x = food.isSleeping();
		boolean y = food2.isSleeping();
	
		if(x==true)
			food.bark();
			
		if(x==true&&y==true)
			food2.bark();



	}
}
