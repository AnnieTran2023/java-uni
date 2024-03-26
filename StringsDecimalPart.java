
import java.util.Scanner;

public class StringsDecimalPart {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		String userInput = input.nextLine();
		
		int validPoint = 0;
		for(String letter : userInput.split("")) {
			if (letter.equals(".") || letter.equals(",")){
				validPoint++;
			}
		}
		
		if((!userInput.contains(".") && !userInput.contains(",")) || userInput.length() < 3 || validPoint > 1 
				|| userInput.indexOf(",")==0 || userInput.indexOf(".") == 0) {
			System.out.println("Please enter a proper decimal number");
			
		} else {
			
			int indexDot = userInput.indexOf(",");
			if (indexDot == -1) {
			    indexDot = userInput.indexOf(".");
			}
			
			int numberOfDecimals = userInput.length() - indexDot - 1;
			
			System.out.println(numberOfDecimals + " decimal place(s)");
		}
	}

}
