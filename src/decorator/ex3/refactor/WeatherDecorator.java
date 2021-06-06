package decorator.ex3.refactor;

public class WeatherDecorator extends DisplayDecorator {
    private Display decoratorDisplay;

    public WeatherDecorator(Display decoratorDisplay) {
        this.decoratorDisplay = decoratorDisplay;
    }

    @Override
    public void draw() {
        System.out.println(decoratorDisplay.getClass());
        decoratorDisplay.draw();
        drawWeather();
    }

    private void drawWeather() {
        System.out.println("도로 날씨 표시");
    }
}
