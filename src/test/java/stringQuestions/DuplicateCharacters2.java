package stringQuestions;

public class DuplicateCharacters2 {

	public static void main(String[] args) {
		
		countDuplicateChars("allapebela",'a');

	}

	private static void countDuplicateChars(String str, char c) {
		
		int counter = 0;
		
		char ch = Character.toLowerCase(c);
		
		for(int i = 0; i < str.length() - 1; i++) {
			
			if(str.charAt(i) == ch) {
				counter++;
			}
		}
		
		System.out.println("The character " + c + " occurs " + counter + " number of times in the word");
	}

}
