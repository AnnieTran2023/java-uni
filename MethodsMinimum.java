import java.util.Scanner;

public class MethodsMinimum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int a = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int b = Integer.parseInt(input.nextLine());

		System.out.print("Enter third integer: ");
		int c = Integer.parseInt(input.nextLine());

		System.out.println(String.format("\nThe minimum value is %d", minimum(a, b, c)));

	}

	private static int minimum(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}
	}

}
