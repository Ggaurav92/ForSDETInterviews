package hackerRank;

public class AnagramsThird {

	public static void main(String[] args) {
	
			System.out.println(isAnagrams("Malayam","maaalym"));

	}

	private static boolean isAnagrams(String a, String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if(a.length() != b.length()) {
			
			return false;
		}
		
		int count = 0;
		
		for(int i = 0; i < a.length() - 1; i++) {
			
			int chInt = a.charAt(i);
			count = count + chInt;
			
			System.out.println("Added count " + count);
			
			int ch2Int = b.charAt(i);
			
			count = count - ch2Int;
			System.out.println("Reduced count " + count);
		}
		
		if(count == 0) {
			return true;
		}
		
		return false;
		
	}

}
