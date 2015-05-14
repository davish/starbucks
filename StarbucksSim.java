import java.util.Random;



public class StarbucksSim {
	public static void main(String[] args) {
		Store star = new Store(100);
		Random ran = new Random();
		
		Customer[] customers = new Customer[100];
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer();
		}

		int rounds = 100;
		for (int j = 0; j < rounds; j++) {
			star.payDay();
			for (Customer c : customers) {
				/*
				 *  int order = ran.nextInt(baristas.placeOfEmployment.menu.size());
					Product p = baristas.placeOfEmployment.menu.get(order);
				 * */
				
				int b = ran.nextInt(star.baristas.size());
				Employee barista = star.baristas.get(b);
				
				c.placeOrder(barista);
				//System.out.println(c);
			}
			System.out.println("Round number " + j + ": " + star);
		}

	}
}
