package stringQuestions;

public class SwapNumbers2 {

	public static void main(String[] args) {
		
		swapNumbers(10,20);

	}

	private static void swapNumbers(int a, int b) {
		
		
		a = a + b; //30
		
		b = a - b; //10
		
		a = a - b; //20
		
		System.out.println(a);//20
		System.out.println(b);//10
		
	}

}
