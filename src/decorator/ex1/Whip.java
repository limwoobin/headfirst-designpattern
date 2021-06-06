package decorator.ex1;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        cost = 0.35;
    }

    @Override
    public double cost() {
        return cost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }
}
