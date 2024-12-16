/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int random = (int)(Math.random()*150)+51;
		int[]arr= new int [random];
		int random1 = (int)(Math.random()*100)+1;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		System.out.println("Elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*150)+51;
			sum = sum+arr[i];
			System.out.println(arr[i]);
		}
	
		System.out.println("-------------------");
		System.out.print("Min: ");
		
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println(min);
		System.out.println("-------------------");
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>min)
				min = arr[i];
	}
	System.out.print("Max: ");
	System.out.println(min);
	System.out.println("-------------------");
	int average = sum/arr.length;
	System.out.print("Average: ");
	System.out.print(average);

		
	}
}
