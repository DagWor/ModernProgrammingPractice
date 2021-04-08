package questionC;

public abstract class Employee {
    private String empId;

    public Employee(String empId){
        this.empId = empId;
    }
    void print(){
        System.out.println(this.empId);
    }

    Paycheck calcCompensation(int month, int year){
        double totalGross = calcGrossPay(month, year);
        return new Paycheck(totalGross);
    }

    abstract double calcGrossPay(int month, int year);

}
