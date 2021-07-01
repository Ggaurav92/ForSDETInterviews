package stringQuestions;

public class StringContainsSpecialCharacters {
	
	public static void main(String[] args) {
		
		String s = "!#$GeeeksforGeeksComputer.Science.Portal!!";
		System.out.println("The count of special characters is " + countSpecialchars(s));
	}

	private static int countSpecialchars(String s) {
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) 
					&& !Character.isWhitespace(s.charAt(i))) {
				
				count++;
			}
		}
		
		return count;
	}

	

}
