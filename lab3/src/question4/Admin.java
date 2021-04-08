package question4;

import java.util.List;

public class Admin {
	public Residence[] residences;


	public Admin(Residence[] residences){
		this.residences = residences;
	}

	public static double computeTotalRent(Residence[] properties) {
		double totalRent = 0;
		for (Residence rd : properties){
			totalRent += rd.computeRent();
		}
		return totalRent;
	}

	public int computeTotalCount() {
		int counter = 0;
		for (Residence rd : residences){
			counter += rd.computeCount();
		}
		return counter;
	}
}
