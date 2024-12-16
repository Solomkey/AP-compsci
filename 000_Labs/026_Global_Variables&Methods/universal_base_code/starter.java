/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        myCharacter x = new myCharacter();
        System.out.println("You got " + x.role+".");
        System.out.println("------------------------------------------------");
        System.out.println("What class will you go?");
        System.out.println("Warrior, Wizard, or Rogue?");
        String y = sc.nextLine();
        System.out.println("------------------------------------------------");
        if(y.equalsIgnoreCase("Warrior")){
            System.out.println("You chose the Warrior!");
            System.out.println("rahhhh!");
        }
        else if(y.equalsIgnoreCase("Wizard")){
            System.out.println("You chose the Wizard!");
            System.out.println("smart!");
        }
        else if(y.equalsIgnoreCase("Rogue")){
            System.out.println("You chose the Rogue!");
            System.out.println("sneaky!");
        }
        else{
            System.out.println("wrong input");
            y = "no role";
        }
        myCharacter charac = new myCharacter(y);
        System.out.println(charac.role);
        
        myCharacter u = new myCharacter(y, 0,0,0,0);
        u.myToString();
    }
}