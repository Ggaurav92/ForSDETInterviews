package stringQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountOccurences2 {

	public static void main(String[] args) {
		
		countOccurence("I am learning Java Java");
		countOccurence("I am learning learning Java learning");
		
		
	}

	private static void countOccurence(String str) {
		
		String[] strArray = str.split(" ");
		
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		
		
		for(String st: strArray) {
			if(myMap.get(st) == null) {
				myMap.put(st, 1);
			}else {
				
				myMap.put(st, myMap.get(st) + 1);
			}
			
			
		}
		
		System.out.println(myMap);
		
		
		Iterator<String> it = myMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String a = it.next();
			
			if(myMap.get(a) > 1) {
				
				System.out.println("The word " + a + " appears " + myMap.get(a) + " times");
			}
		}
		
		
	}
	
}
