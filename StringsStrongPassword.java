import java.util.Scanner;

class StringsStrongPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkStrength(password) == true) {
			System.out.println("OK");
		} else if (checkStrength(password) == false) {
			System.out.println("Not strong enough!");
		}

	}

	public static boolean checkStrength(String password) {
		
		if (password.length() >= 8) {
			int counter = 0;
			if (password.matches(".*[$&+,;=?@#|'<>._\\-^*()%!\\s].*")) {
				counter++;
			}
			if (password.matches(".*[a-z].*")) {
				counter++;
			}
			if (password.matches(".*[A-Z].*")) {
				counter++;
			}
			if (password.matches(".*[0-9].*")) {
				counter++;
			}
			return counter >= 3;
		} else {
			return false;
		}
	}

}
