package factory.ex1.factory;

public class NYSupremePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NYSupremePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYSupremePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYSupremePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYSupremePizza bok");
    }
}
