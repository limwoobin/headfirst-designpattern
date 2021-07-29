package factory.ex1.factory;

public class ChicagoMeetPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoMeetPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoMeetPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoMeetPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoMeetPizza bok");
    }
}
