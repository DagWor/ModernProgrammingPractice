package question4;

public abstract class Residence {
    private int count;

    protected Residence() {
        count++;
    }

    int computeCount(){
        return count;
    }

    abstract double computeRent();

}