package questionE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> account;

	public Employee(String name){
		this.name = name;
		this.account = new ArrayList<>();
	}

	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
		for (Account acc : account){
			sum += acc.computeUpdatedBalance();
		}
		return sum;
	}

	public void addAccount(Account account){
		this.account.add(account);
	}
}
