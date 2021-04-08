package questionC;

public class Paycheck {
    public double grossPay;
    public double fica;
    public double state;
    public double local;
    public double medicare;
    public double socialSecurity;

    public Paycheck(double grossPay){
        this.grossPay = grossPay;
        this.fica = 0.23;
        this.state = 0.05;
        this.local = 0.01;
        this.medicare = 0.03;
        this.socialSecurity = 0.075;
    }

    void print(){
        System.out.println("here is a print");
    }

    double getNetPay(){
        double net = 0.0;
        net += grossPay * fica;
        net += grossPay * state;
        net += grossPay * local;
        net += grossPay * medicare;
        net += grossPay * socialSecurity;

        return net;
    }

}
