package decorator.ex3.origin;

public class RoadDisplayWithLane extends RoadDisplay {
    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("차선 표시");
    }
}
