package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

import java.util.List;

public class Controller {

    private List<TemperatureSensor> temperatureSensors;
    private FireAlarm fireAlarm;

    public Controller(List<TemperatureSensor> temperatureSensors, FireAlarm fireAlarm) {
        this.temperatureSensors = temperatureSensors;
        this.fireAlarm = fireAlarm;
    }

    public List<TemperatureSensor> getTemperatureSensors() {
        return temperatureSensors;
    }

    public void setTemperatureSensors(List<TemperatureSensor> temperatureSensors) {
        this.temperatureSensors = temperatureSensors;
    }

    public FireAlarm getFireAlarm() {
        return fireAlarm;
    }

    public void setFireAlarm(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    public boolean controlStep(){
        for (TemperatureSensor sensor: this.temperatureSensors
             ) {
            if(sensor.getValue()<50){
                System.out.println("Fire Alaram not started");
                return false;
            }
        }
        System.out.println("Fire Alarm has started");
        return true;
    }
}
