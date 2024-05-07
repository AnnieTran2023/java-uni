import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Person {
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
class Student extends Person {
	private int credits;

	public Student(String name, int credits) {
		super(name);
		this.credits = credits;
	}

	public Student(String name) {
		super(name);
		this.credits = 0; 
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int completeCourse() {
		credits += 5;
		return credits;
	}

	public String toString() {
		return String.format("Student: %s, %d credits", getName(), credits);
	}

}

class Teacher extends Person {
	
	private double salary;

	public Teacher(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(Locale.US);
        symbols.setDecimalSeparator('.'); 
        DecimalFormat df = new DecimalFormat("###0.0", symbols); 
        return String.format("Teacher: %s, salary is %s", getName(), df.format(salary));
	}
}


public class PersonInheritanceProgram {
	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher("Chris Date", 3000);
		
		Teacher teacher2 = new Teacher("Joe Satriani", 5000);
		
		Student student = new Student("Steve Vai");
		
		System.out.println(teacher1);
		System.out.println(teacher2);
		System.out.println(student);
		
		student.completeCourse();
		student.completeCourse();
		System.out.println("---");
		System.out.println(student);
	}
}
