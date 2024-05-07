import java.util.Locale;

class Component {
	
	private String id;
	private String name;
	private double price;
	
	public Component(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

class Frame extends Component{
	
	private String material;

	public Frame(String id, String name, String material, double price) {
		super(id, name, price);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String toString() {
		Locale.setDefault(Locale.US);
		return String.format("%s: %s %s frame, %.1f euros", getId(), getName(), material, getPrice());
	}
}
class GroupSet extends Component{
	
	private int gears;

	public GroupSet(String id, String name, int gears, double price) {
		super(id, name, price);
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
	
	public String toString() {
		Locale.setDefault(Locale.US);
		return String.format("%s: %s group set, %d gears, %.1f euros", getId(), getName(), gears, getPrice());
	}
}

public class ComponentInheritanceProgram {
	
	public static void main(String[] args) {
		
		Component[] bike1 = { new Frame("F001", "SuperLight", "titanium", 1500),
				new GroupSet("GS01", "Campagnolo Record", 11, 2300) };
		
		Component[] bike2 = { new Frame("F002", "AluLight", "aluminium", 700),
				new GroupSet("GS02", "Shimano Ultegra", 10, 900) };
		
		double totalPrice = 0;
		
		System.out.println("--- Bike 1 ---");
		
		for (Component component : bike1) {
			System.out.println(component);
			totalPrice += component.getPrice();
		}
		System.out.println("Total price: " + totalPrice);
		
		totalPrice = 0;
		
		System.out.println("\n--- Bike 2 ---");
		for (Component component : bike2) {
			System.out.println(component);
			totalPrice += component.getPrice();
		}
		System.out.println("Total price: " + totalPrice);
	}
}

