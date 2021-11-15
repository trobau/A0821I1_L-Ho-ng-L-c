package _6_Inheritance.practice.system_Of_Geometric_Objects;

public class system_Of_Geometric_Objects {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
