package numbers;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		System.out.println(factOfNum(5));

	}

	private static int factOfNum(int num) {
		
		int fact = 1;
		
		for(int i = 1; i <= num; i++) {
			
			fact = fact * i;
		}
		
		return fact;
	}

}
