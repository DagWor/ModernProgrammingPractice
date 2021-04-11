package test;

import exercise2.Company;
import exercise2.FunctionalUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FunctionalTestTest {
    @Test
    public Company popCompany(){
        Company company = new Company("Personal");

        return company;
    }

    @Test
    public void testTotalExpensesWhenEmpty() {
        assertEquals(popCompany(),5000);
        FunctionalUtils.annualExpense.apply(popCompany(), 2005);
    }

}