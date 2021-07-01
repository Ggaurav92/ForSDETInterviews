package stringQuestions;

public class StringReverse {

	public static void main(String[] args) {
		
		
		System.out.println(reverseString("Programming"));

	}

	private static String reverseString(String str) {
		
		StringBuilder str2 = new StringBuilder(str);
		
		str2.reverse();
		
		System.out.println(str2);
		
		String reverse = "";
		
		for(int i = str.length() - 1 ; i >= 0; i--) {
			
			reverse += str.charAt(i);
		}
		
		return reverse;
	}

}
