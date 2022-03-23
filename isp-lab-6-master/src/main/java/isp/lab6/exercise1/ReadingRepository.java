package isp.lab6.exercise1;

import java.util.*;

public class ReadingRepository implements IReadingRepository{
    public List<SensorReading> sensorReadings;
    @Override
    public void addReading(SensorReading reading) {
        this.sensorReadings.add(reading);
    }

    @Override
    public double getAvarageValueByType(Type type, String location) {
        int counter = 0;
        double avg=0;
        for (SensorReading reading:this.sensorReadings
             ) {
            if(reading.getType() == type && Objects.equals(reading.getLocation(), location)){
                counter++;
                avg+=reading.getValue();
            }
        }
        return avg/counter;
    }

    @Override
    public List<SensorReading> getReadingsByType(Type type) {
        List<SensorReading> listByType = new ArrayList<>();
        for (SensorReading reading:this.sensorReadings
             ) {
            if(reading.getType() == type)
                listByType.add(reading);
        }
        return listByType;

    }

    @Override
    public void listSortedByLocation() {
        this.sensorReadings.sort(Comparator.comparing(SensorReading::getLocation));
    }

    @Override
    public void listSortedByValue() {
        this.sensorReadings.sort(Comparator.comparing(SensorReading::getValue));
    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
         List<SensorReading> listByType = new ArrayList<>();
        for (SensorReading reading: this.sensorReadings
             )
        {if(reading.getType()==type && Objects.equals(reading.getLocation(), location))
            listByType.add(reading);
        }
        return listByType;
    }
}
