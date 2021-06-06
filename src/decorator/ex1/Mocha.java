package decorator.ex1;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        cost = 0.20;
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return cost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
