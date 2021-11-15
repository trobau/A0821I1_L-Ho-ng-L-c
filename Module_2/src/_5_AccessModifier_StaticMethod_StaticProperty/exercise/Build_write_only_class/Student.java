package _5_AccessModifier_StaticMethod_StaticProperty.exercise.Build_write_only_class;

public class Student {
    private String name = "john";
    private String classes = "C02";
    Student(){};

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString(){
        String result;
        result = "name : "+name+"class : "+classes;
        return result;
    }
}
