package factory;

import factory.ingredient.NYPizzaIngredientFactory;
import factory.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza(ingredientFactory);
            case "pepperoni":
                return new NYStylePepperoniPizza(ingredientFactory);
            case "clam":
                return new NYStyleClamPizza(ingredientFactory);
        }

        return null;
    }
}
