package questionE;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sum = 0.0;
		for (Employee employee : list){
			sum += employee.computeUpdatedBalanceSum();
		}
		return sum;
	}
}
