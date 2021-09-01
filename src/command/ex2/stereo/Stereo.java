package command.ex2.stereo;

public class Stereo {
    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo on");
    }

    public void off() {
        System.out.println(name + " Stereo off");
    }
}
