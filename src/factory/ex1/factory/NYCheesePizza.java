package factory.ex1.factory;

public class NYCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NYCheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYCheesePizza box");
    }
}
