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
		int[]arr=new int[1000];
		for(int i=0; i<1000; i++){
			int a = (int)(Math.random()*100);
			arr[i]=a;
			System.out.println(arr[i]);
		}


		
	}
}
