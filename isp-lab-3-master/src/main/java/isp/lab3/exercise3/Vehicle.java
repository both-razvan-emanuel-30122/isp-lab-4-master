package isp.lab3.exercise3;
public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    
    private static int count;
    
    public Vehicle(String model, String type, int speed, char fuelType){
        this.model = model;
        this.type = type;
        this.speed = speed;
        
        if(fuelType == 'B' || fuelType == 'D'){ this.fuelType = fuelType; }
        else
        { throw new IllegalArgumentException("Unavailable!"); }
        
        count++;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public String getType(){
        return this.type;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public char getFuelType(){
    if(fuelType == 'B' || fuelType == 'D'){ this.fuelType = fuelType; }
        else
        { throw new IllegalArgumentException("Unavailable!"); }
    return this.fuelType;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setType(String tpye){
        this.type = type;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public void setFuelType(char fuelType){
        this.fuelType = fuelType;
    }
    
    @Override
    public String toString() {
        return model +
                " (" + type + ") " +
                " speed " + speed +
                " fuel type " + fuelType;
    }
    
    public static int numberOfObjects(){
        return Vehicle.count;
    }
}