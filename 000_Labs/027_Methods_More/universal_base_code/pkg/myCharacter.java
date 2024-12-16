/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
    public String role;
    public int strength;
    public int charis;
    public int intel;
    public int dex;

	
	
	public myCharacter(String m, int s, int c, int d, int i){
		role=m;
		strength = s;
		charis = c;
		dex = d;
		intel = i;
	}
	
	public String setRole(String role){
		if(role.equalsIgnoreCase("Warrior")){
            System.out.println("You chose the Warrior!");
            System.out.println("rahhhh!");
        }
        else if(role.equalsIgnoreCase("Wizard")){
            System.out.println("You chose the Wizard!");
            System.out.println("smart!");
        }
        else if(role.equalsIgnoreCase("Rogue")){
            System.out.println("You chose the Rogue!");
            System.out.println("sneaky!");
        }
        else{
            System.out.println("wrong input");
            role = "no role";
	}
	return role;
	}
	

	public int setStrength(int strength){
		if(strength<0){
		strength=0;
		return strength;
		}
		else
		return strength;
	}
	
	public int setCharisma(int charis){
		if(charis<0){
		charis=0;
		return charis;
	}
		else
		return charis;
	}
	
	public int setDexterity(int dex){
		if(dex<0){
		dex=0;
		return dex;
	}
		else
		return dex;
	}
	
	public int setIntelligence(int intel){
		if(intel<0){
		intel=0;
		return intel;
	}
		else
		return intel;
	}
	
	public boolean setAll(String role, int strength, int charis, int dex, int intel){
		if((strength*charis*dex*intel)<=0){
			return false;
		}
		else{
		return true;
		}
	}
	
	
	

	public void myToString(){
		System.out.println("---------------------");
		System.out.println("strength: "+strength);
		System.out.println("charisma: "+charis);
		System.out.println("dexterity: "+dex);
		System.out.println("intelligence: "+intel);
		
	}


}


