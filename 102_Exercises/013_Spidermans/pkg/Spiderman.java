package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "Unknown";
	}
	// int Age consowntor! 				Actor - Unknown, Villain Unknown
	public Spiderman(int ag){
		actor = "Unknown";
		villain = "Unknown";
		age = ag;
	}
	// String Actor, int Age constructor! 	Villain Unknown
	public Spiderman(String a, int ag){
		actor = a;
		age = ag;
		villain = "Unknown";
	}
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(String a, String v, int ag){
		actor = a;
		villain = v;
		age = ag;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getActor(){
		return actor;
	}
	
	public void setActor(String actor){
		this.actor = actor;
	}
	
	public String getVillain(){
		return villain;
	}
	
	public void setVillain(String villain){
		this.villain = villain;
	}
	
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
