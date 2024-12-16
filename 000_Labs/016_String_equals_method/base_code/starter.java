/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose to be a Wizard, Rogue, or Warrior: ");
		String one = sc.nextLine();
		
		if (one.equals("Wizard")){
			System.out.print("You have chosen to be a Wizard! Excelsior!");
		}
		else if(one.equals("wizard")){
			System.out.print("You have chosen to be a Wizard! Excelsior!");
		}
		else if(one.equals("Rogue")){
			System.out.print("You have chosen to be a Rogue! How cunning!");
		}
		else if(one.equals("rogue")){
			System.out.print("You have chosen to be a Rogue! How cunning!");
		}
		else if(one.equals("Warrior")){
			System.out.print("You have chosen to be a Rogue! How cunning!");
		}
		else if(one.equals("warrior")){
			System.out.print("You have chosen to be a Warrior! For Honor!");
		}
		else{
			System.out.print("You have not chosen a role. Rerun program.");
		}
	}
}
