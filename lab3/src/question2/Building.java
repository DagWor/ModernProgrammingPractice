package question2;

import java.util.List;

public class Building {
    private List<Apartment> apartment;
    private double maintenanceCost;

    public Building(List<Apartment> apartment, double maintenanceCost){
        this.apartment = apartment;
        this.maintenanceCost = maintenanceCost;
    }

    public double getRent(){
        double sum = 0.0;
        for (Apartment a : apartment) {
            sum += a.getRent();
        }
        return sum - maintenanceCost;
    }

    public List<Apartment> getApartment(){
        return apartment;
    }
}
