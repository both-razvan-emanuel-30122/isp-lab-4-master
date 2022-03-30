package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise3 {
    public static void main(String[] args) {
        FireAlarm fireAlarm = new FireAlarm(false);
        TemperatureSensor temperatureSensor =new TemperatureSensor(67,"CLUJ NAPOCA");
        Controller obj1 = new Controller(temperatureSensor,fireAlarm);
        obj1.controlStep();
        assert (obj1.getFireAlarm().isActive());
    }
}
