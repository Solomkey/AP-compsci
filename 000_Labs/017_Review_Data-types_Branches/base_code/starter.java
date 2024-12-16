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
		
		int points = 20;
		
	System.out.println("You have 20 points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	System.out.print("Strength (1-10): ");
	int strength = sc.nextInt();
	if(strength>10){
		System.out.print("Please enter a smaller number.");
		sc.nextLine();
	}
	else{
	System.out.println("You have "+(points-strength)+" left to spend.");
	}
	System.out.print("Dexterity (1-10): ");
	int dex = sc.nextInt();
	if(dex>10){
		System.out.print("Please enter a smaller number.");
		sc.nextLine();
	}
	else{
	System.out.println("You have "+(points-strength-dex)+" left to spend.");
	}
	System.out.print("Intelligence (1-10): ");
	int intel = sc.nextInt();
	if(intel>10){
		System.out.print("Please enter a smaller number.");
		sc.nextLine();
	}
	else{
	System.out.println("You have "+(points-strength-dex-intel)+" left to spend.");
	}
	System.out.print("Charisma (1-10): ");
	int charis = sc.nextInt();
	if(charis>10){
		System.out.print("Please enter a smaller number.");
		sc.nextLine();
	}
	else{
	System.out.println("You have "+(points-strength-dex-intel-charis)+" left to spend.");
	}
	System.out.println("-----------------------------------------------------");
	System.out.println("You are "+name+", the "+title+" of CVHS.");
	System.out.println("You are a "+one+" with the following stats!");
	System.out.println("Strength: "+strength);
	System.out.println("Dexterity: "+dex);
	System.out.println("Intelligence: "+intel);
	System.out.println("Charisma: "+charis);

	
	



	
	
	}
}
