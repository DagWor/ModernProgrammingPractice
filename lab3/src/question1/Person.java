package question1;

public class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object aPerson) {
        if(aPerson == null) return false;
        if(!(aPerson instanceof Person)) return false;
        Person p = (Person)aPerson;
        return this.name.equals(p.name);
    }
    public static void main(String[] args) {

    }
}
