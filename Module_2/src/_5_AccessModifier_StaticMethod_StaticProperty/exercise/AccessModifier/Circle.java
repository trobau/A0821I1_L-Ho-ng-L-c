package _5_AccessModifier_StaticMethod_StaticProperty.exercise.AccessModifier;

public class Circle {
    static final double PI = 3.14;
    private double radius = 1.0;
    private String color = "red";
    Circle(){};
    Circle(double radius){
        this.radius = radius;
    }
    public double getDarius(){
        return this.radius;
    }
    public double getArea(){
        return 2*this.radius*PI;
    }

}
