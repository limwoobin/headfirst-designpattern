package factory.ex1.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoCheesePizza();
        } else if ("meet".equals(type)) {
            return new ChicagoMeetPizza();
        } else if ("supreme".equals(type)) {
            return new ChicagoSupremePizza();
        }

        throw new IllegalArgumentException("없는 피자");
    }
}
