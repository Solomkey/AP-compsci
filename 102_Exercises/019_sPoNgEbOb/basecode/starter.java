/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word you would like to be  spongecased");
		String word = sc.nextLine();
		String m = "";
		int y = 1;
		int w = 0;
		for(int i=0; i<word.length(); i++){
			String x = (word.substring(w, w+1)).toLowerCase();
			m = m+x;
			String q = (word.substring(y, y+1)).toUpperCase();
			m = m+q;
			w=w+2;
			y=y+2;
			if(y+1>word.length()){
				break;
			}
		}
		
		
		if(word.length()%2==1){
			m = m + word.substring(word.length()-1, word.length());
		}
		
		System.out.print(m);
		
		
		
		/*
		MR POOLE'S EXAMPLE!!!
		String result = "";
		for(int i=0; i<word.length; i++){
			String letter = word.substring(i, i+1);
			
			if(i%2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result+letter; (flip these to make it backwards: letter+result)
		}
		
		*/
		String finalSent= "";
		while(true){
			if(sentence.indexOf(" ")==-1){
				finalSent = finalSent+" "+spongeCase(sentence);
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			spongeCase(word);
			
			sentence = sentence.substring(space+1);
			finalSent = finalSent+" "+spongeCase(word);
		}
		System.out.println(finalSent);
	}
}

public static String spongeCase(String word){
	String result = "";
		for(int i=0; i<word.length; i++){
			String letter = word.substring(i, i+1);
			
			if(i%2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result+letter;
		}
		return result;
}