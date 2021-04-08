package question2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(3000);
        Apartment apartment2 = new Apartment(2000);
        Apartment apartment3 = new Apartment(1000);

        Apartment apartment4 = new Apartment(200);
        Apartment apartment5 = new Apartment(450);



        Building building = new Building(Arrays.asList(apartment1, apartment2, apartment3), 2300);

        Building building1 = new Building(Arrays.asList(apartment4, apartment5), 150);

        Landlord landlord = new Landlord(Arrays.asList(building1, building));

        System.out.println("The Monthly Profit of the Landlord (including Maintenance Cost is : " + landlord.getProfit());
    }
}
