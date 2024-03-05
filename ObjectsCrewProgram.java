import java.util.ArrayList;
class Sailor {
	
	private String name;
	private String email;
	
	public Sailor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
class Crew {

	ArrayList<Sailor> sailorList = new ArrayList<Sailor>();
	

	public Crew() {
		super();
	}

	void addCrewMember(Sailor sailor) {
		
		sailorList.add(sailor);
	}

	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
        for (Sailor sailor : sailorList) {
            result.append(sailor.getName()).append(" (").append(sailor.getEmail()).append(")\n");
        }
        return result.toString();
	}
}
public class ObjectsCrewProgram {
	
	 public static void main(String[] args) {
		 
	 Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
	 Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
	 Sailor thirdSailor = new Sailor("John", "john@sailors.com");
	 Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");
	 
	 Crew firstCrew = new Crew();
	 Crew secondCrew = new Crew();
	 
	 firstCrew.addCrewMember(firstSailor);
	 firstCrew.addCrewMember(secondSailor);
	 firstCrew.addCrewMember(fourthSailor);
	 
	 secondCrew.addCrewMember(thirdSailor);
	 secondCrew.addCrewMember(secondSailor);
	 
	 System.out.println("=== First crew ===\n" + firstCrew);
	 
	 System.out.println("=== Second crew ===\n" + secondCrew);
	 
	 secondSailor.setEmail("Susan@sailors.com");
	 
	 System.out.println("===Second crew ===\n" + secondCrew);
	 }
	}
