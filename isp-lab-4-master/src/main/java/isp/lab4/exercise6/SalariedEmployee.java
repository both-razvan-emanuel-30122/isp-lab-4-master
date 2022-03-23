package isp.lab4.exercise6;

public class SalariedEmployee extends Employee{
private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double getPaymentAmount() {
        return 10;
    }
}
