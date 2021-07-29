package factory.ex1.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            return new ChicagoCheesePizza(ingredientFactory);
        } else if ("meet".equals(type)) {
            return new ChicagoMeetPizza(ingredientFactory);
        } else if ("supreme".equals(type)) {
            return new ChicagoSupremePizza(ingredientFactory);
        }

        throw new IllegalArgumentException("없는 피자");
    }
}
