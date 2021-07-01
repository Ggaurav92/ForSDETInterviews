package stringQuestions;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {
	
	public static Set<String> permutationFinder(String str){
		
		Set<String> perm = new HashSet<String>();
		
		
		if(str == null) {
			return null;
		} else if(str.length() == 0) {
			perm.add("");
			return perm;
		}
		
		
		char initial = str.charAt(0);
		
		String rem = str.substring(1);
		System.out.println("initial is : " + initial);
		System.out.println("remaining is : " + rem);
		System.out.println();
		
		Set<String> words = permutationFinder(rem);
		System.out.println("after recursion");
		System.out.println(words);
		System.out.println();
		
		for(String strNew : words) {
			System.out.println("inside for loop");
			System.out.println("strNew is : " + strNew);
			System.out.println("initial is : " + initial);
			System.out.println();
			for(int i = 0; i <= strNew.length();i++) {
				
				perm.add(charInsert(strNew,initial,i)); // F, E, 1
			}
		}
		return perm;
	}
	
	
	
	private static String charInsert(String str, char c, int j) {
		
		String begin = str.substring(0,j);
		//System.out.println("begin is : " + begin);
		
		String end = str.substring(j);
		//System.out.println("end is : " + end );
		
		return begin + c + end;
	}



	public static void main(String[] args) {
		
		
		System.out.println(permutationFinder("AACDEFG"));
		
	}

}
