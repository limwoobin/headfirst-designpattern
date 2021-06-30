package factory;

import factory.ingredient.PizzaIngredientFactory;

public class NYStyleClamPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        name = "NYStyleClamPizza";
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
        cheese = ingredientFactory.createCheese();
    }
}
