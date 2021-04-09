package exercise1;

public class Course {
    private String name;
    private int creditScore;

    public Course(String name, int creditScore) {
        this.name = name;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }
}
