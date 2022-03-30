package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
import isp.lab4.exercise4.Controller;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
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
        House house1 = new House(controller);
        assert(!house1.getController().controlStep());
        //assert(!controller.controlStep());
    }
}
