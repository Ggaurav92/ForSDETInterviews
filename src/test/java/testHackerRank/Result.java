package testHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Result {
	
	
public static List<String> extractData(String hierarchicalData, int level) {
        
        List<String> Level1 = new ArrayList<String>();
         for(int i = 0; i < hierarchicalData.length() - 1; i++){
            
            if(hierarchicalData.charAt(i) == '{'){
                
                String[] arr = hierarchicalData.split("{");
                Level1.add(arr[1]);
                
            }
            
        }
         
         System.out.println(Level1.get(0));
		return Level1;
    }


	
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        System.out.println(input);
        String[] tokens = input.split("::");
        String content = tokens[0];
        int level = Integer.parseInt(tokens[1]);
        
        
        List<String> lines = Result.extractData(content.replace("\\n", "\n"), level);
        List<String> finalLines = new ArrayList<String>(); 
        for(String line: lines) {
            finalLines.add(line.trim());
        }
                                              
        System.out.print(finalLines);
       
    }

}
