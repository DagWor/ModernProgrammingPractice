package question4;

public class House extends Residence {

	private double lotSize;
	private Address address;
	
	
	public House(double lotSize, Address address) {
		super();
		this.address = address;
		this.lotSize = lotSize;

	}


	public double computeRent(){
		return 0.1 * lotSize;
	}
}