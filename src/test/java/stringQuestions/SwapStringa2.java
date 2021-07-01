package stringQuestions;

public class SwapStringa2 {

	public static void main(String[] args) {
		
		swapString("apple","banana");

	}

	private static void swapString(String a, String b) {
		
	
		
		a = a.concat(b);//11
		
		b = a.substring(0,a.length() - b.length());
		
		a = a.substring(b.length(),a.length());
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
