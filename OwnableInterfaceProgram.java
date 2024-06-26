import java.util.Locale;

class MotorVehicle {
	
	private String model;

	public MotorVehicle(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
interface Ownable {

	public abstract double getValue();
}

class Car extends MotorVehicle implements Ownable{
	
	private double value;

	public Car(String model, double value) {
		super(model);
		this.value = value;
	}
	
	@Override
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public String toString() {
		Locale.setDefault(Locale.US);
		return String.format("Car: %s (value %.1f euros)", getModel(), value);
	}
}
class PublicBus extends MotorVehicle{
	
	private String lineNumber;


	public PublicBus(String model, String lineNumber) {
		super(model);
		this.lineNumber = lineNumber;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public String toString() {
		Locale.setDefault(Locale.US);
		return String.format("Bus: %s (line %s)", getModel(), lineNumber);
	}
}
class Bicycle implements Ownable {
	
	private String model;
	private double value;
	
	public Bicycle(String model, int value) {
		super();
		this.model = model;
		this.value = value;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		Locale.setDefault(Locale.US);
		return String.format("Bicycle: %s (value %.1f euros)", model, value);
	}
}

public class OwnableInterfaceProgram {

	public static void main(String[] args) {
		
		Car car = new Car("VW Golf", 5000);
		Bicycle bike1 = new Bicycle("Colnago C50", 520);
		Bicycle bike2 = new Bicycle("Trek 9500", 340);
		PublicBus bus1 = new PublicBus("Ebusco Coach", "10");
		PublicBus bus2 = new PublicBus("Volvo Coach", "11");
		MotorVehicle[] motorVehicles = { car, bus1, bus2 };
		Ownable[] myOwnVehicles = { car, bike1, bike2 };
		
		double totalValue = 0;
		System.out.println("=== All motor vehicles ===");
		
		for (MotorVehicle vehicle : motorVehicles) {
			System.out.println(vehicle);
		}
		
		System.out.println("\n=== My own vehicles ===");
		
		for (Ownable ownVehicle : myOwnVehicles) {
			System.out.println(ownVehicle);
			totalValue += ownVehicle.getValue();
		}
		
		System.out.println("-------------------------");
		System.out.println("The total value is " + totalValue + " euros.");
	}

}


