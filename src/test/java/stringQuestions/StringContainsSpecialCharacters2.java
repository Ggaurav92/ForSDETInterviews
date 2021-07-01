package stringQuestions;

public class StringContainsSpecialCharacters2 {

	public static void main(String[] args) {
		
		String s = "!#$GeeeksforGeeksComputer.Science.Portal!";
		System.out.println("The count of special characters is " + countSpecialchars(s));

	}

	private static int countSpecialchars(String s) {
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++){
			
			char ch = s.charAt(i);
			
			if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)) {
				
				count ++;
				
			}
			
		}
		
		return count;
		
	}

}
