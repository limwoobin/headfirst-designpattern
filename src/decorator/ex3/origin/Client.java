package decorator.ex3.origin;

public class Client {
    public static void main(String[] args) {
        RoadDisplay roadDisplay = new RoadDisplay();
        roadDisplay.draw();

        System.out.println("-----------------------------------");

        RoadDisplay roadWithLane = new RoadDisplayWithLane();
        roadWithLane.draw();

        System.out.println("-----------------------------------");

        RoadDisplayWithTraffic roadWithTraffic = new RoadDisplayWithTraffic();
        roadWithTraffic.draw();
    }
}
