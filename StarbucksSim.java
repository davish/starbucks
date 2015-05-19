import java.util.Random;



public class StarbucksSim {
	public static void main(String[] args) {


		for (int i = 0; i<100; i++) {
			double sum = 0.00;
			for (int k = 0; k<100; k++) {
				Store star = new Store(100, i);
				Random ran = new Random();

				Customer[] customers = new Customer[100];
				for (int j = 0; j < customers.length; j++) {
					customers[j] = new Customer();
				}

				int rounds = 100;
				for (int j = 0; j < rounds; j++) {
					star.payDay();
					for (Customer c : customers) {
						int b = ran.nextInt(star.baristas.size());
						Employee barista = star.baristas.get(b);

						c.placeOrder(barista);
						//System.out.println(c);
					}
					
					//	System.out.println("Round number " + j + ": " + star);
				}
				sum = sum + star.bank;
				//			System.out.println(star.orderHistory);
			} //second for
			System.out.println(sum/100.0);
		} //first for


	}
}
