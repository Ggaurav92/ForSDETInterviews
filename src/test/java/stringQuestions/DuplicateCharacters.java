package stringQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		countDuplicateChars("allapebella",'L');
	}

	private static void countDuplicateChars(String str, Character myChar) {
		
		
		int counter = 0;
		

		
		for(int i = 0; i <= str.length() - 1; i++) {
			
			if(str.charAt(i) == myChar) {
				
				counter++;
			}
			
		}
		
		
		System.out.println("The Character " + myChar + " occurs " + counter + " number of times in the String");
	}

	

}
