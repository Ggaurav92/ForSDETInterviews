package numbers;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseNumber(123456));
	}

	private static int reverseNumber(int num) {
		
		int b = 0;
		
		while(num != 0) {
			
			int n = num % 10;
			b = (b * 10) + n;
			//System.out.println(b);
			
			num = num / 10;
			
			//System.out.println(num);
			
		}
		
		return b;
	}

}
