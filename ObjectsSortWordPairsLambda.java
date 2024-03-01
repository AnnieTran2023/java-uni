
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

class WordPair implements Comparable<WordPair> {
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

    public String toString() {
        return String.format("%s = %s", englishWord, finnishWord);
    }

    public String toFinnishString() {
        return String.format("%s = %s", finnishWord, englishWord);
    }

    public int compareTo(WordPair other) {
        return this.englishWord.compareTo(other.englishWord);
    }
}
class FinnishComparator implements Comparator<WordPair> {
 
    public int compare(WordPair wp1, WordPair wp2) {
        return wp1.getFinnishWord().compareTo(wp2.getFinnishWord());
    }
}
public class ObjectsSortWordPairs {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        List<WordPair> englishPairs = new ArrayList<>();
        List<WordPair> finnishPairs = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an English word (quit ends): ");
        
        String englishWord = input.nextLine();

        while (!englishWord.equalsIgnoreCase("quit")) {
         
            System.out.print("Enter a Finnish word: ");
            
            String finnishWord = scanner.nextLine().trim();

            WordPair pair = new WordPair(englishWord, finnishWord);
            
            englishPairs.add(pair);
            finnishPairs.add(pair);
            
            System.out.print("\nEnter an English word (quit ends): ");
            englishWord = input.nextLine();
        }

        Collections.sort(englishPairs);
        Collections.sort(finnishPairs, new FinnishComparator());
        
        System.out.println();
        for (WordPair pair : englishPairs) {
            System.out.println(pair);
        }

        System.out.println();
        for (WordPair pair : finnishPairs) {
            System.out.println(pair.toFinnishString());
        }
    }
}

