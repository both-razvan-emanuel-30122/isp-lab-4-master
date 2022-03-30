package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        ComissionEmployee comissionEmployee = new ComissionEmployee("Razvan","Both",10,100);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Razvan","Both",1000,50);
        SalariedEmployee salariedEmployee =new SalariedEmployee("Razvan","Both",100000);
        assert (comissionEmployee.getPaymentAmount()==25);
        assert (hourlyEmployee.getPaymentAmount()==30);
        assert (salariedEmployee.getPaymentAmount()==10);
    }
}
