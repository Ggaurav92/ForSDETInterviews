package numbers;

public class CheckIfArmStrongNumber {

	public static void main(String[] args) {
		
		int num = 8208 ;
		if(num == ifArmStrongNumber(num)) {
			System.out.println("The number is an Armstrong number");
		} else {
			
			System.out.println("The number is not an Armstrong number");
		}
		

	}

	private static int ifArmStrongNumber(int input) {
	
		int digitCount = countDigit(input);
		int finalSum = 0;
		
		while(input != 0) {
			
			int digit = input % 10;
			
			finalSum = (int) (finalSum + Math.pow(digit, digitCount));
			
			
			input = input / 10;
		}
		
		return finalSum;
		
	}

	private static int countDigit(int num) {
		
		int count = 0;
		while(num != 0) {
			
			num = num / 10;
			count++;
		}
		return count;
	}

}
