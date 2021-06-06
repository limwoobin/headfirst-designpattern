package decorator.ex3.interface_type;


public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();

        System.out.println("-----------------------------------");

        road = new LaneDecorator(road);
        road = new TrafficDecorator(road);
        road = new WeatherDecorator(road);

        road.draw();
    }
}
