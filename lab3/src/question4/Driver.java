package question4;

public class Driver {

	public static void main(String[] args) {

		Residence[] objects = { new House(9000, new Address("4th North", "Fairfield", "Iowa", "52556")), new Condo(2, new Address("4th North", "Fairfield", "Iowa", "52556")), new Trailer(new Address("4th North", "Fairfield", "Iowa", "52556")) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);

		Admin admin = new Admin(objects);

		int properties = admin.computeTotalCount();
		System.out.println("Total number of properties " + properties);
	}
}