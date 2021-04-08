package question4;

public class Trailer extends Residence  {

	private Address address;
	public Trailer(Address address) {
		super();
		this.address = address;
	}

	public double computeRent(){
		return 500;
	}
}