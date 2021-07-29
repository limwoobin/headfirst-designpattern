package factory.ex1.factory;

public class SupremePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("SupremePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("SupremePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("SupremePizza cut");
    }

    @Override
    public void box() {
        System.out.println("SupremePizza bok");
    }
}
