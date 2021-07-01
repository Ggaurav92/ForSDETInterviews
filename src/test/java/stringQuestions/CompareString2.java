package stringQuestions;

public class CompareString2 {

	public static void main(String[] args) {
		
		String a = "applee";
		String b = "apple";
		
		System.out.println(compareString(a,b));
		}

	private static boolean compareString(String a, String b) {
		
		if(a.compareTo(b) == 1) {
			return false;
		} else {
			return true;
		}
		
	}
	
	

}
