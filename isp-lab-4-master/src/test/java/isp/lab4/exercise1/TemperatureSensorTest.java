package isp.lab4.exercise1;



import java.util.Objects;

public class TemperatureSensorTest {
    public TemperatureSensorTest() {
    }

    public boolean GetTest(){
    TemperatureSensor ob1 = new TemperatureSensor(2,"Baia Mare");
    assert(ob1.getValue() == 2);
    assert(Objects.equals(ob1.getLocation(), "Baia Mare"));
return true;
}
}
