package stringQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString2 {

	public static void main(String[] args) {
		
		findLongestSubString("abcdabertyuio");

	}

	private static void findLongestSubString(String str) {
		
		Set<Character> mySet = new HashSet<Character>();
		
		String longestTillNow = "";
		String longestOverAll = "";
		
		for(int i = 0; i < str.length() - 1; i++) {
			
			if(mySet.contains(str.charAt(i))) {
				
				longestTillNow = "";
				mySet.clear();
			}
			
			mySet.add(str.charAt(i));
			longestTillNow += str.charAt(i);
			
			if(longestTillNow.length() > longestOverAll.length()) {
				
				longestOverAll = longestTillNow;
			}
			
			
		}
		
		System.out.println("The longest substring is " + longestOverAll);
		
	}
	

}
