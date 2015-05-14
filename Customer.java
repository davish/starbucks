import java.util.List;
import java.util.Random;


public class Customer {
	
	public Random ran = new Random();
	
	/** the amount the customer has paid in his lifetime */
	public int totalPaid;
	
	/**
	 * pick product from the store's menu.
	 * add cost to totalPaid
	 * @return the product to be placed
	 */
	public Product placeOrder(Employee baristas) {
		
		int order = ran.nextInt(baristas.placeOfEmployment.menu.size());
	
		Product p = baristas.placeOfEmployment.menu.get(order);
		totalPaid += p.price;
		
		baristas.processOrder(p);
		
		return p;
	}
	
	public String toString() {
		return totalPaid + "";
	}

}
