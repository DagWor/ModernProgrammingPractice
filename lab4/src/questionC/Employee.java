package questionC;

public abstract class Employee {
    private final String empId;

    public Employee(String empId){
        this.empId = empId;
    }
    void print(){
        System.out.println(this.empId);
    }

    public Paycheck calcCompensation(int month, int year){
        double totalGross = calcGrossPay(month, year);
        return new Paycheck(totalGross);
    }

    public abstract double calcGrossPay(int month, int year);

}
