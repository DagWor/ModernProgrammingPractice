package question2;

import java.util.List;

public class Landlord {

    private List<Building> buildings;
    public Landlord(List<Building> buildings){
        this.buildings = buildings;
    }

    public double getProfit(){
        double sum = 0.0;
        for (Building bldg : buildings){
            sum += bldg.getRent();
        }
        return sum;
    }
}
