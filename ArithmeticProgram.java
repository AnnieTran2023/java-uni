package Week_1;

import java.util.Locale;
import java.util.Scanner;

public class ArithmeticProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter another integer: ");
		int number2 = Integer.parseInt(input.nextLine());

		System.out.print("Enter a decimal number: ");
		double decimal = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println(String.format("\n%d * %d = %d", number1, number2, number1 * number2));

		System.out.println(String.format("%d * %s = %s", number1, decimal, number1 * decimal));

		System.out.println(String.format("%s * %s = %s", decimal, decimal, decimal * decimal));

	}

}

