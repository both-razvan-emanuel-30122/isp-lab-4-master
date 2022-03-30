package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] args){
        Vehicle porsche = new Vehicle("Porsche","GTR3",300,'B');
        //System.out.println(porsche.toString());
        Vehicle mercedes = new Vehicle("Mercedes","SL 300",220,'B');
        
        porsche.setSpeed(280);
        System.out.println(porsche.getSpeed());
        
        mercedes.setFuelType('D');
        System.out.println(mercedes.getFuelType());
        
        System.out.println(porsche.getModel());
        
        //testez daca variabilele create mai sus sunt egale
        System.out.println(mercedes.equals(porsche));
        
        //afisez cate obiecte Vehicul au fost create
        System.out.println(Vehicle.numberOfObjects());
    }
}