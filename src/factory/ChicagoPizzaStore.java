package factory;

import factory.ingredient.ChicagoIngredientFactory;
import factory.ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza(ingredientFactory);
            case "pepperoni":
                return new ChicagoStylePepperoniPizza(ingredientFactory);
            case "clam":
                return new ChicagoStyleClamPizza(ingredientFactory);
        }

        return null;
    }
}
