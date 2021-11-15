package _5_AccessModifier_StaticMethod_StaticProperty.exercise.Build_write_only_class;

public class testStudent {
    public static void main(String[] args) {
        Student a = new Student();
        System.out.println(a);
        Student b = new Student();
        b.setName("Leo");
        b.setClasses("C03");
        System.out.println(b);
    }
}
