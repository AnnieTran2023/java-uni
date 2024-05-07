import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;

class Friend {
	
	private String nickname;
	private String name;
	private LocalDate birthdate;
	
	public Friend(String nickname, String name, LocalDate birthdate) {
		super();
		this.nickname = nickname;
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
		String formattedDate = birthdate.format(formatter);
		return String.format("%s: %s, born %s", nickname, name, formattedDate);
	}
	
}


public class ObjectsFriendMapProgram {
	
	static Map<String, Friend> friends = new HashMap<String, Friend>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = getChoice();

		while (choice != 0) {
			if (choice == 1) {
				addFriend();
			} else if (choice == 2) {
				findFriend();
			} else if (choice == 3) {
				deleteFriend();
			} else if (choice == 4) {
				printFriends();
			} else {
				System.out.println("Please enter a number between 0 and 4");
			}

			choice = getChoice();
		}

		System.out.println("Bye!");
	}

	private static void printFriends() {
		
		System.out.println();
		for (Friend friend : friends.values()) {
			System.out.println(friend);
		}
	}

	private static void deleteFriend() {
		
		System.out.print("\nEnter nickname: ");
		String searchNickname = input.nextLine();
		
		Friend result = friends.get(searchNickname);
		if (result == null) {
			System.out.println(searchNickname + " not found!");
		} else {
			friends.remove(searchNickname);
			System.out.println(searchNickname + " deleted!");
		}
	}

	private static void findFriend() {
		
		System.out.print("\nEnter nickname: ");
		String searchNickname = input.nextLine();
		
		Friend result = friends.get(searchNickname);
		if (result == null) {
			System.out.println(searchNickname + " not found!");
		} else {
			System.out.println(result);
		}
	}

		private static void addFriend() {

		System.out.print("\nEnter nickname: ");
		String nickname = input.nextLine();

		if (friends.containsKey(nickname)) {
			System.out.println(nickname + " is already in use!");
			return;
		}

		System.out.print("Enter name: ");
		String name = input.nextLine();

		boolean dateInput = false;
		LocalDate birthdate = null;

		while (dateInput == false) {
			System.out.print("Enter birthdate (dd.mm.yyyy): ");
			String date = input.nextLine();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

			

			try {
				birthdate = LocalDate.parse(date, formatter);
				dateInput = true;
			} catch (Exception e) {
				System.out.println("Invalid date: " + date);
			}
		}

		Friend newFriend = new Friend(nickname, name, birthdate);

		friends.put(newFriend.getNickname(), newFriend);

	}

	private static int getChoice() {
		
		
		int choice = 0;
	    boolean validInput = false;

	    while (!validInput) {
	        System.out.println("\n1 = Add friend | 2 = Find friend | 3 = Delete friend | 4 = Print friends | 0 = Quit");
	        System.out.print("Enter choice: ");
	        String output = input.nextLine();
	        
	        try {
	            choice = Integer.parseInt(output);
	            validInput = true; 
	        } catch (NumberFormatException e) {
	            System.out.println("Please enter a number between 0 and 4");
	        }
	    }
		
		return choice;
	}

}
