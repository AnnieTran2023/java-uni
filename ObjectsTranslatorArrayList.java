
import java.util.ArrayList;
import java.util.Scanner;

class WordPair {
	private String englishWord;
	private String finnishWord;
	
	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}

	public String getEnglishWord() {
		return englishWord;
	}

	public String getFinnishWord() {
		return finnishWord;
	}

	public String toString () {
		return String.format("%s = %s", englishWord, finnishWord);
	}
}


public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<WordPair> wordsList = new ArrayList<WordPair>();

		
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();

		while (!englishWord.equalsIgnoreCase("ok")) {
			
			
			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();
			
			wordsList.add(new WordPair(englishWord, finnishWord));
			
			System.out.print("\nEnter an English word: ");
			englishWord = input.nextLine();
		}
		
		System.out.println("\n=== English-Finnish translation service (quit ends) ===");
		
		System.out.print("Enter an English word: ");
		String inputWord = input.nextLine();
		
		while(!inputWord.equalsIgnoreCase("quit")) {
			
			boolean isFound = false;
			
			for(WordPair object : wordsList) {
				if(inputWord.equalsIgnoreCase(object.getEnglishWord())) {
					System.out.println(object.getFinnishWord());
					isFound = true;
				}
			}
			
			if (isFound == false) {
				System.out.println("Unknown word");
			}
			
			System.out.print("\nEnter an English word: ");
			inputWord = input.nextLine();

		}
		
		System.out.println("\nBye!");
	}

}
