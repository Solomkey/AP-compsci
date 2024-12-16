/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int random = (int)(Math.random()*10)+1;
		int total = 0;
		int[]arr=new int[20];
		System.out.println("Elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*10)+1;
			System.out.println(arr[i]);
		}
	for(int i=0; i<arr.length; i++){
		if (arr[i]==random){
			System.out.println("Duplicate index number: "+i);
			total++;
		}
	}
		System.out.println("total dupes: "+total);
		
		for(int i=0; i<19; i++){
			if (arr[i]==arr[i+1]+1){
				System.out.println("Index number where consecutive: "+i);
				System.out.println("Number that was consecutive: "+arr[i]);
			}
	
}
}
}