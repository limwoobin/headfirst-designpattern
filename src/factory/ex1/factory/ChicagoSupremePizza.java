package factory.ex1.factory;

public class ChicagoSupremePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoSupremePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoSupremePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoSupremePizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoSupremePizza bok");
    }
}
