package command.ex3.pan;

public class CellingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CellingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.println("Fan High ~");
        this.speed = HIGH;
    }

    public void medium() {
        System.out.println("Fan Medium ~");
        this.speed = MEDIUM;
    }

    public void low() {
        System.out.println("Fan Low ~");
        this.speed = LOW;
    }

    public void off() {
        System.out.println("Fan Off ~");
        this.speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
