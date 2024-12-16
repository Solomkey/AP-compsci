/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf one = new PooleDwarf(randName(), 6);
		PooleDwarf two = new PooleDwarf(randName(), 93);
		PooleDwarf three = new PooleDwarf(randName(), 23);
		PooleDwarf four = new PooleDwarf(randName(), 2);
		PooleDwarf five = new PooleDwarf(randName(), 98);
		PooleDwarf six = new PooleDwarf(randName(), 43);
		PooleDwarf seven = new PooleDwarf(randName(), 11);
		
		int count=0;
		
		String oneName = one.getName();
		
		if((one.isSameName(two.getName())))
			count++;
		if((one.isSameName(three.getName())))
			count++;
		if((one.isSameName(four.getName())))
			count++;
		if((one.isSameName(five.getName())))
			count++;
		if((one.isSameName(six.getName())))
			count++;
			
		System.out.print("There are "+count+" duplicates! the name was ");
		System.out.print(one.getName());
		
		
	}
}
