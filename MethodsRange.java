import java.util.Scanner;

public class MethodsRange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first value: ");
		int first = Integer.parseInt(input.nextLine());

		System.out.print("Enter last value: ");
		int second = Integer.parseInt(input.nextLine());

		System.out.println();

		printRange(first, second);
	}

	private static void printRange(int number1, int number2) {
		for (int i = number1; i <= number2; i++) {
			System.out.print(i + " ");
		}
	}

}
