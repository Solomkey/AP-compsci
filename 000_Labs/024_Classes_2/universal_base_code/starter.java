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
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex. Slayer of dragons");
		String title = sc.nextLine();
		
		System.out.println("Please choose to be a Wizard, Rogue, or Warrior: ");
		String one = sc.nextLine();
		
		if (one.equals("Wizard")){
			System.out.println("You have chosen to be a Wizard! Excelsior!");
		}
		else if(one.equals("wizard")){
			System.out.println("You have chosen to be a Wizard! Excelsior!");
		}
		else if(one.equals("Rogue")){
			System.out.println("You have chosen to be a Rogue! How cunning!");
		}
		else if(one.equals("rogue")){
			System.out.println("You have chosen to be a Rogue! How cunning!");
		}
		else if(one.equals("Warrior")){
			System.out.println("You have chosen to be a Rogue! How cunning!");
		}
		else if(one.equals("warrior")){
			System.out.println("You have chosen to be a Warrior! For Honor!");
		}
		else{
			System.out.print("You have not chosen a role. Rerun program.");
		}
		
		
		myCharacter  = new BaseClass();
		


		
	}
}
