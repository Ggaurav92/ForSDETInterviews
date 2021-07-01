package stringQuestions;

public class IfAnagram {
	
	public static void main(String[] args) {
		
		System.out.println(ifAnagram("Night","Thing"));
	}

	private static boolean ifAnagram(String firstString, String secondString) {
		
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		
		int counter = 0;
		
		if(firstString.length() != secondString.length()) {
			return false;
		}
		
		for(int i = 0; i <= firstString.length() - 1;i++) {
			
			counter = counter + firstString.charAt(i);
			counter = counter - secondString.charAt(i);
		}
		
		if(counter == 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
