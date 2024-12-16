/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Slot machine rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		
		int starting = 100;
		
		while(starting>0){
			int roll1 = ((int)(Math.random()*10)+1);
			int roll2 = ((int)(Math.random()*10)+1);
			int roll3 = ((int)(Math.random()*10)+1);
			System.out.print("Would you like to play slots? (Yes/y/Y/yes): ");
			String yes = sc.nextLine();
			if(yes.equals("Yes")||yes.equals("yes")||yes.equals("y")||yes.equals("Y")){
				System.out.println("You have $"+starting+". How much would you like to wager?");
				int wager = sc.nextInt();
				sc.nextLine();
				if(wager<=starting && wager>0){
					System.out.println("Your rolls are: ");
					System.out.println(roll1+" | "+roll2+" | "+roll3);
				
					if(roll1==roll2 && roll2==roll3){
						System.out.println("Your wager has been tripled!");
						starting+=wager*2;
					}
					else if(roll1==roll2 || roll1==roll3 || roll2==roll3){
						System.out.println("Your wager has been doubled!");
						starting+=wager;
						System.out.println("You have "+starting+" left");
					}
					else{
						System.out.println("Didn't win this time!");
						starting-=wager;
						System.out.println("You have "+starting+" left");
					}
					if(starting<=0)
						break;
					}
			
			else
				System.out.println("Wrong input");
			}
		else if(yes.equals("No")||yes.equals("no")||yes.equals("n")||yes.equals("N")){
				System.out.print("Why don't you want to gamble?? Ok bye");
				System.out.print("You have "+starting+" left");
				break;
				}
				
}
}
}
