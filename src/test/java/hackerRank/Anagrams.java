package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		Map<String,Integer> firstMap = new HashMap<String,Integer>();
		Map<String,Integer>	secondMap = new HashMap<String,Integer>();
		
		for (int i = 0; i < a.length(); i++) {
			int firstCount = 0;
			
			for (int j = 0; j < a.length(); j++) {
				
				if(a.toLowerCase().charAt(i) == a.toLowerCase().charAt(j)) {
					
					firstCount++;
					//System.out.println(firstCount);
				}
			}
			//System.out.println(a.charAt(i));
			//System.out.println(firstCount);
			firstMap.put(Character.toString(a.toLowerCase().charAt(i)), firstCount);
			
		}
		System.out.println(firstMap);

		for (int i = 0; i < b.length(); i++) {
			int secondCount = 0;
			
			for (int j = 0; j < b.length(); j++) {
				
				if(b.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)) {
					
					secondCount++;
					//System.out.println(firstCount);
				}
			}
			//System.out.println(a.charAt(i));
			//System.out.println(firstCount);
			secondMap.put(Character.toString(b.toLowerCase().charAt(i)), secondCount);
			
		}
		
		System.out.println(secondMap);
		
		return firstMap.equals(secondMap);
		
    }//end of method

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
