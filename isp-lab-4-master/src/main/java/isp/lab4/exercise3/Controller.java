package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Controller {
    private TemperatureSensor temperatureSensor;
    private FireAlarm fireAlarm;


    public Controller(TemperatureSensor temperatureSensor, FireAlarm fireAlarm) {
        this.temperatureSensor = temperatureSensor;
        this.fireAlarm = fireAlarm;
    }

    public void controlStep(){
        if(this.temperatureSensor.getValue()>50) {
            this.fireAlarm.setActive();
            System.out.println("Fire alarm started!");
        }
            else{
            System.out.println("Fire alarm not started");
        }
    }

    public TemperatureSensor getTemperatureSensor() {
        return temperatureSensor;
    }

    public void setTemperatureSensor(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    public FireAlarm getFireAlarm() {
        return fireAlarm;
    }

    public void setFireAlarm(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }
}
