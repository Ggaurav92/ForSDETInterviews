package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketOfAnagrams {

	public static void main(String[] args) {
		String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
        Map<String, List<String>> anagramMap = anagramsBucket(input);
        
        System.out.println("AnagramsBucket : " + anagramMap);
        
	}

	private static Map<String, List<String>> anagramsBucket(String[] input) {
		
		Map<String,List<String>> myAnagrams = new HashMap<>();
		
		for(String s: input) {
			
			char[] ch = s.toCharArray();
			
			Arrays.sort(ch);
			
			String key = String.valueOf(ch);
			
			if(!myAnagrams.containsKey(key)) {
				
				myAnagrams.put(key, new ArrayList<>());
				
			}
			
			myAnagrams.get(key).add(s);
			
			
		}
		
		
		
		
		return myAnagrams;
	}

	

}
