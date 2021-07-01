package stringQuestions;

public class PrintOnetoHundred {
	
	
	
	
	public static void main(String[] args) {
		
		printNum(100);
	}

	private static void printNum(int n) {
		
		
		if(n > 0) {
			
			
			printNum(n-1);
			System.out.print(n + " ");
		}
		
	}

}
