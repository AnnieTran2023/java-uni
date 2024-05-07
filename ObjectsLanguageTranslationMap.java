
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ObjectsLanguageTranslationMap {

	public static void main(String[] args) {
		
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		
		Map<String, String> words = new HashMap<String, String>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();
		
		while (!englishWord.equals("ok")) {
			
			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();
			
			words.put(englishWord, finnishWord);
			
			System.out.print("\nEnter an English word: ");
			englishWord = input.nextLine();
		}
		
		
		System.out.println("\n=== English-Finnish translation service (quit ends) ===");
		
		System.out.print("Enter an English word: ");
		String searchWord = input.nextLine();
		
		while(!searchWord.equals("quit")) {
			
			String result = words.get(searchWord);
						
			if (result == null) {
				System.out.println("Unknown word");
			} else {
				System.out.println(result);
			}
			
			System.out.print("\nEnter an English word: ");
			searchWord = input.nextLine();
			
		}
		
		System.out.println("Bye!");
	}

}
