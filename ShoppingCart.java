import java.util.ArrayList;
class ShoppingCart {

	ArrayList<Item> itemList = new ArrayList<Item>();
	
	ShoppingCart(){
		
	}	
	
	public void add(Product product, int quantity) {
		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {
	    for (int i = 0; i < itemList.size(); i++) {
	        Item item = itemList.get(i);
	        if (item.getProduct().equals(product)) { 
	            itemList.remove(i); 
	            break; 
	        }
	    }
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		
		for (Item item : itemList) {
			totalPrice += item.getSubtotal();
		}
		
		return totalPrice;
	}
	
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		if (itemList.size() == 0) {
			result.append("There are no items in the shopping cart.");
		} else {
			
			result.append("\n=== Shopping cart ===");
			for (Item item : itemList) {
				result.append("\n").append(item.toString());
			}
			String formattedTotalPrice = String.format("%.2f", this.getTotalPrice()); 
			result.append("\nTOTAL PRICE: ").append(formattedTotalPrice).append(" euros");
		}
		
		
		return result.toString();
	}
}

class Item {
	
	private Product product;
	private int quantity;
	
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		return product.getPrice() * quantity;
	}
	
	public String toString() {
		return String.format("%d: %s, quantity: %d, unit price: %.2f, subtotal: %.2f", 
				product.getId(), product.getName(), quantity, product.getPrice(), this.getSubtotal());
	}
}
class Product {
	
	private int id;
	private String name; 
	private double price; 
	
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
public class ObjectsShoppingCartProgram {
	
	 public static void main(String[] args) {
		 
	 ShoppingCart cart = new ShoppingCart();
	 
	 Product product_1 = new Product(10, "Bicycle", 500.00);
	 Product product_2 = new Product(11, "Energy bar", 1.50);
	 Product product_3 = new Product(12, "Water bottle", 6.00);

	 System.out.println(cart);
	 
	 cart.add(product_1, 1);
	 cart.add(product_2, 5);
	 cart.add(product_3, 2);
	 System.out.println(cart);

	 cart.remove(product_2);
	 System.out.println(cart);
	 }
	}
