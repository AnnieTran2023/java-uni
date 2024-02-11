
import java.util.Scanner;

public class ArraysFinnish {

	public static void main(String[] args) {

		String[] englishWord = { "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher" };
		String[] finnishWord = { "bussi", "auto", "kissa","talo", "kuu", "aurinko", "kiitos", "juna", "opettaja" };

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an English word: ");
		String userInput = input.nextLine();

		boolean isFound = false;

		for (int i = 0; i < englishWord.length; i++) {
			if (userInput.equals(englishWord[i])) {
				System.out.println(finnishWord[i]);
				isFound = true;
			}
		}

		if (isFound == false) {
			System.out.println("Unknown word");
		}

	}

}
