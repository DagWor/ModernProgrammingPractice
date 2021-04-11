package exercise2;

public class PartTime implements Role{
    private FullTime manager;

    public PartTime(FullTime manager) {
        this.manager = manager;
    }

    public FullTime getManager() {
        return manager;
    }

    public void setManager(FullTime manager) {
        this.manager = manager;
    }
}
