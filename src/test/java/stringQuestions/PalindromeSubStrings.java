package stringQuestions;

public class PalindromeSubStrings {
	
	public static void main(String[] args) {
		
		System.out.println(noOfPalindromeSubString("TENET while MALAYALAM by the RADAR"));
	}

	private static int noOfPalindromeSubString(String str) {
		
		String[] str1 = str.split(" ");
		int count = 0;
		for(int j = 0; j < str1.length; j++) {
		
		String subString = str1[j];
		System.out.println(str1[j]);	
		
		boolean flag = false;
		for(int i = 0; i < subString.length() - 1; i++) {
			
			if(!(subString.charAt(i) == subString.charAt(subString.length() - 1 - i))) {
				flag = false;
				break;
			}else {
				flag = true;
			}
		}
		
		if(flag == true) {
			count++;
		}
		}
		
		return count;
	}

}
