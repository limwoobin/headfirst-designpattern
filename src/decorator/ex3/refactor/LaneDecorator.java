package decorator.ex3.refactor;

public class LaneDecorator extends DisplayDecorator {
    private Display decoratorDisplay;

    public LaneDecorator(Display decoratorDisplay) {
        this.decoratorDisplay = decoratorDisplay;
    }

    @Override
    public void draw() {
        System.out.println(decoratorDisplay.getClass());
        decoratorDisplay.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("차선 표시");
    }
}
