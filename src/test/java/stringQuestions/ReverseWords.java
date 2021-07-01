package stringQuestions;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		System.out.println(reverseWords("Programming"));
	}

	private static String reverseWords(String str) {
		
		
		String reverseStr = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			reverseStr += str.charAt(i);
		}
		
		return reverseStr;
	}

}
