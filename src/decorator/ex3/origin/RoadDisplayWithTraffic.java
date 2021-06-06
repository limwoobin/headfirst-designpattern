package decorator.ex3.origin;

public class RoadDisplayWithTraffic extends RoadDisplay {
    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("트래픽 표시");
    }
}
