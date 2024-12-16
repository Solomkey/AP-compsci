/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have a key? (answer in all lowercase)");
		String yesorno = sc.nextLine();
		if(yesorno.equals("no")){
			System.out.println("Please enter your code");
			String code = sc.nextLine();
			String message = Cipher.encode(code);
			System.out.println("Your code is: "+ message);
			
			int count = 0;
			while(count<36){
			count++;
			message = Cipher.keyedEncode(code, count);
			System.out.println("Your code is: "+message);
		}
		if(yesorno.equals("yes")){
			System.out.println("Please enter your code and key");
			String code2 = sc.nextLine();
			int key = sc.nextInt();
			String message2 = Cipher.keyedEncode(code2, key);
			System.out.println("Your code is:"+ message2);
		}
		}
	
		/*System.out.println("Please enter something you want to encode: ");
		String code = sc.nextLine();
		String encodedMessage = Cipher.encode(code);
		System.out.println("Your secret code is: " + encodedMessage);
		
		
		
*/
	}
}
