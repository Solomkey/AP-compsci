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

    public myCharacter(String r){
        role = r;
    }
	
	public myCharacter(String m, int s, int c, int d, int i){
		role=m;
		strength = s;
		charis = c;
		dex = d;
		intel = i;
	}
	
	public void myToString(){
		System.out.println("---------------------");
		System.out.println("strength: "+strength);
		System.out.println("charisma: "+charis);
		System.out.println("dexterity: "+dex);
		System.out.println("intelligence: "+intel);
	}
	
    public myCharacter(){
        role = "no role"; 
    }

}

		
		
	



