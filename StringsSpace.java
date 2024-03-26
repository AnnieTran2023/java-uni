
import java.util.ArrayList;
import java.util.Scanner;

public class StringsSpace {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a string: ");
		
		String text = input.nextLine();
		System.out.println(String.format("\"%s\"", removeExtraSpace(text)));
		
	}
	
	public static String removeExtraSpace(String text) {
		
		ArrayList<Character> result = new ArrayList<>();
		
		int lastIndex = text.length() - 1;
		
		int start = 0;
		
        while (start < text.length() && Character.isWhitespace(text.charAt(start))) {
            start++;
        }
        
        if (start < text.length()) {
            result.add(text.charAt(start));
			start++;
        }

        
		   for (int i = start; i <= lastIndex; i++) {
			   
	
				   
			   if (i == lastIndex && !Character.isWhitespace(text.charAt(lastIndex))) {
				   
	                result.add(text.charAt(lastIndex));
	                
	            } else if (i > 0 && i < lastIndex && ( !Character.isWhitespace(text.charAt(i)) || !Character.isWhitespace(text.charAt(i + 1)))) {
	                result.add(text.charAt(i));
	               
	            }
	        }
		

		
		StringBuilder sb = new StringBuilder();
		
        for (Character c : result) {
            sb.append(c);
        }
        
        return sb.toString();
	}
}
