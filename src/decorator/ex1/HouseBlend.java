package decorator.ex1;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드 커피";
        cost = 0.89;
    }

    @Override
    public double cost() {
        return cost;
    }
}
