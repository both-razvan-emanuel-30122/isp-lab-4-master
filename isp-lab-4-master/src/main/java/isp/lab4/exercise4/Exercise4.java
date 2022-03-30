package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {
        TemperatureSensor sensor1 = new TemperatureSensor(70,"Mami");
        TemperatureSensor sensor2 = new TemperatureSensor(80,"Tati");
        TemperatureSensor sensor3 = new TemperatureSensor(20,"EU");
        List<TemperatureSensor> temperatureSensorList = new ArrayList<>();
        temperatureSensorList.add(sensor1);
        temperatureSensorList.add(sensor2);
        temperatureSensorList.add(sensor3);
        FireAlarm fireAlarm = new FireAlarm(false);

        Controller controller = new Controller(temperatureSensorList,fireAlarm);
        assert(!controller.controlStep());
    }
}
