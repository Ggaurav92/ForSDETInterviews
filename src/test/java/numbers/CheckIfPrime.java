package numbers;

public class CheckIfPrime {

	public static void main(String[] args) {
		
		
		System.out.println(isPrime(7));

	}

	private static boolean isPrime(int a) {
		
		for(int i = a - 1; i > 1; i--) {
			
			
			if(a % i == 0) {
				
				return false;
				
			}
		}
		
		return true;
		
		
	}

}
