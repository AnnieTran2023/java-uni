import java.util.Scanner;

public class FixedTerm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter time period in full years: ");
		int years = Integer.parseInt(input.nextLine());

		System.out.print("Enter interest rate (%): ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;

		System.out.print("Enter capital income tax rate (%): ");
		double capitalRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;

		double interestMoneyYearly = 0;
		double totalInterestMoney = 0;

		System.out.println();

		for (int i = 1; i <= years; i++) {

			interestMoneyYearly = deposit * interestRate;

			totalInterestMoney += interestMoneyYearly;

			deposit += interestMoneyYearly;

			System.out.println(String.format("Year %d: %.2f | %.2f", i, totalInterestMoney, deposit));

		}

		double interestAfterTax = totalInterestMoney * (1 - capitalRate);
		double remainingBalance = deposit - (totalInterestMoney - interestAfterTax);

		System.out.println(String.format("\nThe interest after tax is %.2f", interestAfterTax));
		System.out.println(String.format("The remaining balance after tax is %.2f", remainingBalance));
	}

}
