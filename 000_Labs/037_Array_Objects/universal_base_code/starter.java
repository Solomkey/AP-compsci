/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
			Warrior[]warrior= new Warrior[100];
			Wizard[]wizard= new Wizard[100];
			
			for(int i=0; i<wizard.length; i++){
				wizard[i]=new Wizard();
				warrior[i]=new Warrior();
			}
			
			int y=0;
			int t=0;
			while(wizard[99].isDead()==false&&warrior[99].isDead()==false){
				wizard[t].attack(warrior[y]);
					if(warrior[y].isDead()==true){
						y++;
					}
					if(warrior[99].isDead()==true){
						break;
					}
				warrior[y].attack(wizard[t]);
				if(wizard[t].isDead()==true){
						t++;
			}
		}
			if (wizard[99].isDead()==true){
				System.out.println("The Warriors won with "+(100-y)+" remaining.");
			}
			
			if(warrior[99].isDead()==true){
				System.out.println("The Wizards won with "+(100-t)+" remaining.");
			}
		}
}
