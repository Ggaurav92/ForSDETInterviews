package numbers;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n = 20;
		fib(n);

	}

	private static void fib(int n) {
		
		
		int numOne = 0;
		int numTwo = 1;
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(numOne + " ");
			
			int sum = numOne + numTwo;
			
			numOne = numTwo;
			numTwo = sum;
			
			
		}
		
	}

}
