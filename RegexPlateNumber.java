
import java.util.Scanner;

public class RegexPlateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter plate number: ");
		String number = input.nextLine();
		
		if (number.matches("[A-Z]{3}-\\d{3}")) {
            System.out.println("OK");
        } else {
            System.out.println("Invalid plate number");
        }
        
	}

}
