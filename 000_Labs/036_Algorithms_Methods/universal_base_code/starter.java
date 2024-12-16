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
		
		int[]arr= new int[100];
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(Math.random()*100)+1;
		}
		toStringArray(arr);
		getArrayAverage(arr);
		getArrayMax(arr);
		getArrayMin(arr);
		


		
	}
	
	
	
	
	public static void toStringArray(int[]x){
		for(int i=0; i<x.length; i++)
			System.out.println(x[i]);
	}
	
	
	public static int getArrayAverage(int[]x){
		int sum = 0;
		int i = 0;
		for(i=0; i<x.length; i++){
			sum = sum+x[i];
		}
			sum=sum/i;
			return sum;
	}
	
	public static int getArrayMax(int[]x){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<x.length; i++){
			if(x[i]>min)
				min = x[i];
		}
		return min;
	}
	
	public static int getArrayMin(int[]x){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<x.length; i++){
			if(x[i]<min)
				min = x[i];
		}
		return min;
	}
	
	
}
