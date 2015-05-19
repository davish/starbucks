import java.util.Random;



public class StarbucksSim {
	public static void main(String[] args) {
		while (true) {
			Store star = new Store(100);
			Random ran = new Random();

			Customer[] customers = new Customer[100];
			for (int i = 0; i < customers.length; i++) {
				customers[i] = new Customer();
			}

			int rounds = 100;
			double[] record = new double[rounds];
			for (int j = 0; j < rounds; j++) {
				star.payDay();
				for (Customer c : customers) {
					int b = ran.nextInt(star.baristas.size());
					Employee barista = star.baristas.get(b);

					c.placeOrder(barista);
					//System.out.println(c);
				}
				record[j] = star.bank;
				System.out.println("Round number " + j + ": " + star);
			}
//			System.out.println(record[record.length-1]);
//			System.out.println(star.orderHistory);
		}

	}
}
