package stringQuestions;

public class ReverseOrderOfWords {

	public static void main(String[] args) {
		
		String str = "Learn Lead And Succeed in DevLabsAlliance";
		
		System.out.println(reverseOrderOfWords(str));
		

	}

	private static String reverseOrderOfWords(String str) {
		
		
		String[] temp = str.split(" ");
		
		String rev = "";
		
		for(int i = 0; i < temp.length; i++) {
			
			if(i == temp.length)
				rev = temp[i] + rev;
			else 
				rev = " " + temp[i] + rev;
		}
		
		
		return rev;
	}

}
