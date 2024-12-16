/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = sc.nextLine();
	
	
	String finalSent= "";
		while(true){
			if(sentence.indexOf(" ")==-1){
				finalSent = finalSent+" "+pigLatin(sentence);
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			
			sentence = sentence.substring(space+1);
			finalSent = finalSent+" "+pigLatin(word);
		}
		System.out.println(finalSent);
	}
	
	public static String pigLatin(String sentence){
		String finalSent="";
		String vowels="aeiou";
		String consonants="bcdfghjklmnpqrstvwxyz";
		String first=sentence.substring(0,1);
		String second="";
		if(sentence.length()>1){
			second=sentence.substring(1,2);
		}
		if(vowels.contains(first)){
			finalSent=sentence+"-way";
		}
		if(consonants.contains(first)&&consonants.contains(second)){
			finalSent=sentence+"-"+first+second+"ay";
			return finalSent.substring(2);
		}
		if(consonants.contains(first)&&vowels.contains(second)){
			finalSent=sentence+"-"+first+"ay";
			return finalSent.substring(1);
		}
		return finalSent;
		}
}
