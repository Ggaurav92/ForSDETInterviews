package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Extra {

		public static void main(String[] args) {
	        String a = "anagramm";
	        String b = "marganaa";
			
			// Complete the function
			Map<String,Integer> firstMap = new HashMap<String,Integer>();
			Map<String,Integer>	secondMap = new HashMap<String,Integer>();
			
			for (int i = 0; i < a.length(); i++) {
				int firstCount = 0;
				
				for (int j = 0; j < a.length(); j++) {
					
					if(a.charAt(i) == a.charAt(j)) {
						
						firstCount++;
						//System.out.println(firstCount);
					}
				}
				//System.out.println(a.charAt(i));
				//System.out.println(firstCount);
				firstMap.put(Character.toString(a.charAt(i)), firstCount);
				
			}
			System.out.println(firstMap);

			for (int i = 0; i < b.length(); i++) {
				int secondCount = 0;
				
				for (int j = 0; j < b.length(); j++) {
					
					if(b.charAt(i) == b.charAt(j)) {
						
						secondCount++;
						//System.out.println(firstCount);
					}
				}
				//System.out.println(a.charAt(i));
				//System.out.println(firstCount);
				secondMap.put(Character.toString(b.charAt(i)), secondCount);
				
			}
			
			System.out.println(secondMap);
			
		
		}
		
}
