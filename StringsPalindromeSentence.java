import java.util.ArrayList;
import java.util.Scanner;

public class StringsPalindromeSentence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		if (isPalindrome(text) == true) {

			System.out.println("Palindrome!");

		} else {

			System.out.println("No palindrome");

		}
	}

	public static boolean isPalindrome(String text) {

		ArrayList<Character> textWithoutSpecialChar = new ArrayList<>();
		ArrayList<Character> compared = new ArrayList<>();

		for (char character : text.toLowerCase().toCharArray()) {

			if (Character.isLetterOrDigit(character)) {
				textWithoutSpecialChar.add(character);
			}

		}
		
		boolean result = true;
		
		int textLength = textWithoutSpecialChar.size();
		
		if(textLength == 0) {
			result = false;
		}
		
		for (int i = 0 ; i < textLength - 1 ; i++) {
			
			if(!(textWithoutSpecialChar.get(i) == textWithoutSpecialChar.get(textLength - i - 1))) {
				result = false;
			}
			
		}
		
		return result;
		
		

	}

}
