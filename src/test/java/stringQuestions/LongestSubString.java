package stringQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	
	private static void findLongestSubString(String str) {
		
		
		Set<Character> mySet = new HashSet<Character>();
		
		String longestTillNow = "";
		String longestOverAll = "";
		
		
		for(int i = 0; i <= str.length() - 1; i++) {
			
			char c = str.charAt(i);
			
			if(mySet.contains(c)) {
				
				longestTillNow = "";
				mySet.clear();
			}
				
				mySet.add(c);
				longestTillNow +=  c;
 
			
			
			if(longestTillNow.length() > longestOverAll.length()) {
				
				longestOverAll = longestTillNow;
			}
			
			
			
		}
		
		System.out.println("The Longest substring is " + longestOverAll );
		
		
	}
	
	public static void main(String[] args) {
		
		findLongestSubString("abcdab");
		
	}

	
	
}//End of Class
