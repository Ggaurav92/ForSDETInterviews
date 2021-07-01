package stringQuestions;

public class SumOfnumbersInString {

	public static void main(String[] args) {
		
		// input alphanumeric string
        String str = "12abc20yz68ZZ";
 
        // Function call
        System.out.println(findSum(str));

	}

	private static int findSum(String str) {
	
		String temp = "0";
		
		int sum = 0;
		
		for(int i = 0; i <= str.length() - 1; i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				temp += ch;
			} else {
				
				sum += Integer.parseInt(temp);
				
				temp = "0";
			}
				
			
		}
		
		return sum += Integer.parseInt(temp);
		
	}
}
