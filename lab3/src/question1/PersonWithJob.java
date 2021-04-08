package question1;

public class PersonWithJob {

    private double salary;
    private Person person;

    public double getSalary() {
        return salary;
    }

    PersonWithJob(String name, double s) {
        this.person = new Person(name);
        salary = s;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object aPerson) {

        if (aPerson == null) return false;
        if (!(aPerson instanceof PersonWithJob)) return false;
        PersonWithJob p = (PersonWithJob) aPerson;
        return this.getPerson().getName().equals(p.getPerson().getName())
                && this.getSalary() == p.getSalary();
    }

    public static void main(String[] args) {

        PersonWithJob p1 = new PersonWithJob("Joe", 200);
        PersonWithJob p2 = new PersonWithJob("Joe", 200);
        // As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));

    }


}
