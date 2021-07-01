package testVagrant;

public class InvertingCaps2 {

	public static void main(String[] args) {
	
		String str = "Bangalore is capital of Karnataka";
		invertingCaps(str);

	}

	private static void invertingCaps(String str) {
		
		String finalStr = "";
		
		String[] strArr = str.split(" ");
		
		for(int i = 0; i < strArr.length; i++) {
			
			
			String stringInside = strArr[i];
			
			String temp = "";
			
			char first = Character.toUpperCase(stringInside.charAt(0));
			temp += first;
			
			for(int j = stringInside.length() - 1; j > 0; j--) {
				
				 temp += stringInside.charAt(j);
				
			}
			
			finalStr += temp + " ";
			
		}
		
		System.out.println(finalStr);
	}

}
