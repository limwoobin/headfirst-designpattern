package decorator.ex1;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
        cost = 1.99;
    }

    @Override
    public double cost() {
        return cost;
    }
}
