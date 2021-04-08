package questionC;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee hourly = new Hourly("12354", 250, 40);
        Employee salaried = new Salaried("sadsaf", 100);
        Employee commissioned = new Commissioned("qweasc", 100, 100,
                Arrays.asList(new Order(123, LocalDate.now(), 100),
                        new Order(20, LocalDate.now(), 10),
                        new Order(14, LocalDate.now(), 1))
                );

        Paycheck paycheck = hourly.calcCompensation(5, 2021);
        Paycheck paycheck1 = salaried.calcCompensation(5, 2021);
        Paycheck paycheck2 = commissioned.calcCompensation(5, 2021);

        System.out.println("questionC.Hourly employee net pay: " + paycheck.getNetPay());
        System.out.println("questionC.Salaried employee net pay: " + paycheck1.getNetPay());
        System.out.println("questionC.Commissioned employee net pay: " + paycheck2.getNetPay());
    }
}
