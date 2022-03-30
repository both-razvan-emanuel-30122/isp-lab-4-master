package isp.lab4.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        FireAlarm object1 = new FireAlarm(true);
        FireAlarm object2 = new FireAlarm(false);
        assert(object1.isActive());
        assert(!object2.isActive());
        object2.setActive();
        assert (object2.isActive());
    }
}
