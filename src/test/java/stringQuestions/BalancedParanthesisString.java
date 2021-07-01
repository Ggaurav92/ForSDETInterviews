package stringQuestions;

public class BalancedParanthesisString {

	public static void main(String[] args) {
		
		
		final String input1 = "{}";
	    System.out.println("Checking balanced paranthesis for input:" + input1);
	 
	    if (isBalanced(input1)) {
	      System.out.println("Given String is balanced");
	    } else {
	      System.out.println("Given String is not balanced");
	    }

	}

	private static boolean isBalanced(String str) {
		
		String finalStr1 = "";
		
		StringBuffer finalStr = new StringBuffer(finalStr1);
		
		
		for (int i = 0; i < str.length(); i++) {
			
			
			if(str.charAt(i) == '{') {
				
				finalStr = finalStr.append('{');
				System.out.println(finalStr);
			}else if(str.charAt(i) == '[') {
				
				finalStr = finalStr.append('[');
				
			}else if(str.charAt(i) == '(') {
				
				finalStr = finalStr.append('(');
				
			}
			
			
			if(str.charAt(i) == ']') {
			if(!(finalStr.charAt(finalStr.length() - 1) == '[')) {
				
				return false;
			}else {
				finalStr.deleteCharAt(finalStr.length() - 1);
			}
			}
			
			if(str.charAt(i) == '}') {
				if(!(finalStr.charAt(finalStr.length() - 1) == '{')) {
					System.out.println(finalStr.charAt(finalStr.length() - 1));
					return false;
				}else {
					
					finalStr.deleteCharAt(finalStr.length() - 1);
				}
				}
			
			if(str.charAt(i) == ')') {
				if(!(finalStr.charAt(finalStr.length() - 1) == '(')) {
					
					return false;
				}else {
					finalStr.deleteCharAt(finalStr.length() - 1);
				}
				}
			
			
		}
		
		System.out.println(str.length());
		
		return str.length() == 0;
		
	}

}
