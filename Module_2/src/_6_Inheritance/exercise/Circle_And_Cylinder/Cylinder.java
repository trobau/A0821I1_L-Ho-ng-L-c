package _6_Inheritance.exercise.Circle_And_Cylinder;

public class Cylinder extends Circle{
    private double height = 1.0;
    Cylinder(){}
    Cylinder(double darius,String color,double height){
        super(darius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height*super.getPerimeter();
    }
    public String toString(){
        return super.toString()+" height : " +this.getHeight()+" Volume :"+this.getVolume();
    }
}
