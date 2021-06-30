package factory;

import factory.ingredient.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;
    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        name = "NYStyleCheesePizza";
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
        cheese = ingredientFactory.createCheese();
    }
}
