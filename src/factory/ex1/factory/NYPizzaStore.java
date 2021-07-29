package factory.ex1.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYCheesePizza();
        } else if ("meet".equals(type)) {
            return new NYMeetPizza();
        } else if ("supreme".equals(type)) {
            return new NYSupremePizza();
        }

        throw new IllegalArgumentException("없는 피자");
    }
}
