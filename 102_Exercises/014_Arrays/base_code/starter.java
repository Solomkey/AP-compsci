/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	/*	int[] arr = new int[1001];
		int i = 0;
		while(i<arr.length){
			arr[i] = (i+1)*3;
			System.out.println("Index: "+i+" Value: "+arr[i]);
			i++;
		}
		
		System.out.println("------------------");
		
		int r = 0;
		int[]arr2 = new int[1001];
		while(r<arr2.length){
			arr2[r]=arr2.length-1-r;
			System.out.println("Index: "+r+" Value: "+arr2[r]);
			r++;
		}
		*/
		int[]arr2 = new int[1001];
		for(int r=0; r<arr2.length; r++){
			arr2[r]=arr2.length-1-r;
			System.out.println("Index: "+r+" Value: "+arr2[r]);
		}
		
	}
}
