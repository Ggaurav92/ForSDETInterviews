package stringQuestions;

public class SwapString {

	public static void main(String[] args) {
		
		String a = "apple"; //5
		String b = "banana"; // 6
		
		a = a + b;  // 11
		
		b = a.substring(0,a.length() - b.length());
		
		a = a.substring(b.length(),a.length());
		
		System.out.println(b);
		
		
		
	}
	
	
}
