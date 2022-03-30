package isp.lab3.exercise4;

public class MyPoint {
    public int x;
    public int y;
    public int z;

    public MyPoint() {
        this.x=0;
        this.y=0;
        this.z=0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public void set(int x,int y,int z){
        this.x = x;
        this.y=y;
        this.z = z;
    }

    public int distace(MyPoint point){
        return (this.getX()-point.getX())*(this.getX()-point.getX()) + (this.getY()-point.getY())*(this.getY()-point.getY()) + (this.getZ()-point.getZ())*(this.getZ()-point.getZ());
    }
}

