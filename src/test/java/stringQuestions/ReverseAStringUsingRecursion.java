package stringQuestions;

public class ReverseAStringUsingRecursion {

	public static void main(String[] args) {
		
		String input = "carvia";
		
		reverseString(input);

	}


	private static void reverseString(String input) {
		
		int a = input.length();
		
		System.out.print(input.charAt(a - 1 ));
		
		if(a - 2  > -1) {
			
			reverseString(input.substring(0,a - 1));
		}
				
		
	}
}
