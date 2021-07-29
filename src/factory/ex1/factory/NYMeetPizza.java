package factory.ex1.factory;

public class NYMeetPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NYMeetPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYMeetPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYMeetPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYMeetPizza bok");
    }
}
