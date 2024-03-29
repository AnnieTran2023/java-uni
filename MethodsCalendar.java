import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodsCalendar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());

		System.out.println();

		printCalendar(year, month);

	}

	private static void printCalendar(int year, int month) {

		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };

		String currentMonth = months[month - 1];

		System.out.println(String.format(" > %s %d <", currentMonth, year));

		System.out.println(" Ma Ti Ke To Pe La Su");

		YearMonth yearMonth = YearMonth.of(year, month);

		int daysInMonth = yearMonth.lengthOfMonth();

		ArrayList<String> display = new ArrayList<String>();

		for (int day = 1; day <= daysInMonth; day++) {

			LocalDate myDate = LocalDate.of(year, month, day);
			int dayOfWeek = myDate.getDayOfWeek().getValue();

			if (day == 1) {
				for (int i = 1; i < dayOfWeek; i++) {
					display.add("  ");
				}
				display.add("  " + String.valueOf(day));
			} else {
				int size = display.size();
				if (size == 7 || size == 15 || size == 23 || size == 31 || size == 39) {
					display.add("\n");
				}
				if (day < 10) {
					display.add(" " + String.valueOf(day));
				} else {
					display.add(String.valueOf(day));
				}

			}

		}
		String part1 = String.join(" ", display.subList(0,7));
		String part2 = String.join(" ", display.subList(7,15));
		String part3 = String.join(" ", display.subList(15,23));
		String part4 = String.join(" ", display.subList(23,31));
		String part5 = "";
		String result = "";
		if (display.size() <= 40){
			part5 = String.join(" ", display.subList(31,display.size()));
			result = part1 + part2 + part3 + part4 + part5;

		} else {
			part5 = String.join(" ", display.subList(31,39));
			String part6 = String.join(" ", display.subList(39,display.size()));
			result = part1 + part2 + part3 + part4 + part5 + part6;
		}
		
		
		System.out.println(result);

	}

}
