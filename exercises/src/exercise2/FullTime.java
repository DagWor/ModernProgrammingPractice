package exercise2;

public class FullTime implements Role {
    private FullTime manager;

    public FullTime(FullTime manager) {
        this.manager = manager;
    }

    public FullTime getManager() {
        return manager;
    }

    public void setManager(FullTime manager) {
        this.manager = manager;
    }
}
