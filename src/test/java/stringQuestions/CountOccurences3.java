package stringQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountOccurences3 {

	public static void main(String[] args) {
		
		
		countOccurences("I am learning Java Java learning");

	}

	private static void countOccurences(String str) {
		
		
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		
		String[] strArray = str.split(" ");

		for(String stA : strArray) {
			
			if(map1.get(stA) == null) {
				
				map1.put(stA, 1);
			}else {
				
				map1.put(stA, map1.get(stA) + 1);
			}
		}
		
		System.out.println(map1);
		Iterator<String> it = map1.keySet().iterator();
		
		while(it.hasNext()) {
			
			String next = it.next();
			
			if(map1.get(next) > 1) {
				
				System.out.println("The word " + next + " occurs " + map1.get(next) + " times in the String");
			}
			
		}
		
		
		
	}

	
	
}
