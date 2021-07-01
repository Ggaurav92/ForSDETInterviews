package stringQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountOccurences {
	
	
	private static void countOccurence(String str) {
		
		Map<String,Integer> mp = new HashMap<String,Integer>();
		
		String[] s = str.split(" ");
		
		for(String tempString:s) {
			
			if(mp.get(tempString) == null) {
			mp.put(tempString, 1);
			} else {
				
				mp.put(tempString, mp.get(tempString) + 1);
			}
			
			
		}
		
		Iterator<String> it = mp.keySet().iterator();
		
		while(it.hasNext()) {
			
			String temp = it.next();
			
			if(mp.get(temp) > 1 ) {
				
				System.out.println("The word " + temp + " occurs " + mp.get(temp) + " times in the String");
			}
		}
		
		
		System.out.println(mp);
		
		}
		
		
		
			
	
	
	
	public static void main(String[] args) {
		
		
		countOccurence("I am am learning Java Java");

	}

	

}
