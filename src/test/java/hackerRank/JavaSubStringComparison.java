package hackerRank;

import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubStringComparison {
	
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        SortedSet<String> sets=new TreeSet<String>();
        
    for(int i=0;i<=s.length()-k;i++){
        sets.add(s.substring(i,i+k));
    }
    
    System.out.println(sets.first());
    System.out.println(sets.last());
    smallest = smallest + sets.first();
    largest = largest + sets.last();

        return smallest + "\n" + largest;
    }
	
	public static void main(String[] args) {
	
    
	}//End of pvsm

}//End of Class
