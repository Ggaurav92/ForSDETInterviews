package stringQuestions;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		final String input1 = "{([{{()}}])}{}";
	    System.out.println("Checking balanced paranthesis for input:" + input1);
	 
	    if (isBalanced(input1)) {
	      System.out.println("Given String is balanced");
	    } else {
	      System.out.println("Given String is not balanced");
	    }

	}

	private static boolean isBalanced(String input1) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < input1.length(); i++) {
			
			
			switch(input1.charAt(i)) {
			
			case '[':
			case '{':
			case '(':
				stack.push(input1.charAt(i));
				break;
			case ']':
				if(stack.empty() || !stack.pop().equals('['))
					return false;
					break;
			case '}':
				if(stack.empty() || !stack.pop().equals('{'))
					return false;
					break;
			case ')':
				if(stack.empty() || !stack.pop().equals('('))
					return false;
					break;
			
			}//End of Switch
			
			
			
		}
		
		return stack.isEmpty();
		
		
		
	}//End of method

}//End of Class
