import java.util.Scanner;

public class MethodsTriplex {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= number; i++) {
			System.out.println(String.format("triplex(%d) = %d", i, triplex(i)));
		}

	}

	public static int triplex(int number) {
		int totalValue = 1;
		for (int i = 1; i < number; i = i + 3) {
			totalValue *= i;
		}
		totalValue *= number;
		return totalValue;
	}

}
