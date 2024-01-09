import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] score;

	public Student(String name, int[] score) {
		this.name = name;
		this.score = score;
	}

	public int getNumberOfScore() {
		return score.length;
	}

	int sum = 0;

	public int getTotal() {
		for (int s : score) {
			sum += s;
		}
		return sum;
	}

	public int getMax() {
		int max = score[0];
		for (int s : score) {
			if (s > max) {
				max = s;
			}
		}
		return max;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotal();
		int number = score.length;
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
}

public class StudentRunner {

	public static void main(String[] args) {
		int[] score = { 100, 89, 90, 99 };
		Student student = new Student("Julie", score);
		System.out.println(student.getMax());

		BigDecimal average = student.getAverageMarks();
		System.out.println(average);
	}

}

