package factory.ex1.abstractFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            return new NYCheesePizza(ingredientFactory);
        } else if ("meet".equals(type)) {
            return new NYMeetPizza(ingredientFactory);
        } else if ("supreme".equals(type)) {
            return new NYSupremePizza(ingredientFactory);
        }

        throw new IllegalArgumentException("없는 피자");
    }
}
