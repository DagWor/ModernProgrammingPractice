package question4;

public class Condo extends Residence {

	private int numberOfFloors;
	private Address address;
	
	public Condo(int numberOfFloors, Address address) {
		super();
		this.address = address;
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 400 * numberOfFloors;
	}
}