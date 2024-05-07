import java.util.HashMap;
import java.util.Map;

class Course {
	private String courseCode;
	private String name;
	private int credits;
	
	public Course(String courseCode, String name, int credits) {
		super();
		this.courseCode = courseCode;
		this.name = name;
		this.credits = credits;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String toString() {
		return String.format("%s: %s, %dcr ", courseCode, name, credits);
	}
}

public class ObjectsCourseMapProgram {

	public static void main(String[] args) {
		
		Course course1 = new Course ("swd1tf001","Orientation to Software Engineering",5);
		Course course2 = new Course ("swd4tf033","Programming 2",5);
		Course course3 = new Course("swd4tf032","Programming 1",5);
		
		Map<String, Course> courseList = new HashMap<String,Course>();
		
		courseList.put(course1.getCourseCode(), course1);
		courseList.put(course2.getCourseCode(), course2);
		courseList.put(course3.getCourseCode(), course3);
		
		for (Course course : courseList.values()) {
			System.out.println(course);
		}
		
		System.out.println("---");
		
		System.out.println(courseList.get("swd4tf033"));

	}

}
