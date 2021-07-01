package stringQuestions;

public class RemoveZeroes2 {
	
	public static void main(String[] args) {
		String str = "00000001235469";
		
		str = removeZeros(str);
	}

	private static String removeZeros(String str) {
		
		str = str.replaceAll("[0]?", "");
		
		System.out.println(str);
		
		return str;
	}

}
