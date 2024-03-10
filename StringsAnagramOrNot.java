
import java.util.ArrayList;
import java.util.Scanner;

public class StringsAnagramOrNot {

	public static void main(String[] args) {

		Scanner input =  new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String firstString = input.nextLine();
		
		System.out.print("Enter second string: ");
		String secondString = input.nextLine();
		
		
		if (isAnagram(firstString, secondString) == true) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram");
		}
	}
	
	 public static boolean isAnagram(String first, String second) {
		 
	        if (!isValidInput(first) || !isValidInput(second)) {
	            return false;
	        }
	        
	        String cleanFirst = first.replaceAll("[\\s;,.]", "").toLowerCase();
	        String cleanSecond = second.replaceAll("[\\s;,.]", "").toLowerCase();
	        
	   
	        if (cleanFirst.length() != cleanSecond.length() || cleanFirst.length() == 0 || cleanSecond.length() == 0) {
	            return false;
	        }
	        
	        char[] firstChars = cleanFirst.toCharArray();
	        char[] secondChars = cleanSecond.toCharArray();
	        java.util.Arrays.sort(firstChars);
	        java.util.Arrays.sort(secondChars);
	        
	        return java.util.Arrays.equals(firstChars, secondChars);
	    }
	 
	 
	    public static boolean isValidInput(String str) {
	        return str.matches("[a-zA-ZäÄöÖ\\s;,\\.]*");
	    }

}
