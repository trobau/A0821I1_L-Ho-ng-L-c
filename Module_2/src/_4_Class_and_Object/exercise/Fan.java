package _4_Class_and_Object.exercise;

public class Fan {
    static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double raidus = 5.0;
    private String color = "blue";
    Fan(int speed,double raidus,String color,boolean on){
        this.speed = speed;
        this.on = on;
        this.raidus = raidus;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String result;
        if (this.isOn()) {
            result = "speed: " + getSpeed() + "\t color: " + getColor() + "\t radius: " + getRaidus() + "\t" + "fan is on";
        } else
        {
           result = "color: " + getColor() + "\t radius: " + getRaidus() + "\t" + "fan is off";
        }
        return result;
    }


    public static void main(String[] args) {
        Fan a = new Fan(FAST,
                10,
                "yellow",
                true);
        Fan b = new Fan(SLOW,
                5,
                "blue",
                false);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
