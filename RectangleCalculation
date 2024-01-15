package basics.oop;

import java.util.Scanner;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	public String toString() {
		return String.format("Your rectangle has %d in length and %d in width", length, width);
	}
}

public class RectangleValues {

	public static void main(String[] args) {

		int number1 = 0;
		int number2 = 0;

		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter length: ");
			number1 = input.nextInt();
			System.out.print("Enter width: ");
			number2 = input.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter valid integer");
		}

		Rectangle myRectangle = new Rectangle(number1, number2);
		System.out.println(myRectangle.toString());
		System.out.println(myRectangle.area());
	}

}


