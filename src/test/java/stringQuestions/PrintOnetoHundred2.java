package stringQuestions;

public class PrintOnetoHundred2 {

	public static void main(String[] args) {

		printOnetoHundred(100);

	}
	
	public static void printOnetoHundred(int n) {
		
		if(n  > 0) {
			
			printOnetoHundred(n - 1);
			System.out.print(n + " ");
		}
		
	}

}
