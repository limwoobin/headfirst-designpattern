package decorator.ex3.refactor;

public class TrafficDecorator extends DisplayDecorator {
    private Display decoratorDisplay;

    public TrafficDecorator(Display decoratorDisplay) {
        this.decoratorDisplay = decoratorDisplay;
    }

    @Override
    public void draw() {
        System.out.println(decoratorDisplay.getClass());
        decoratorDisplay.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("도로 교통량 표시");
    }
}
