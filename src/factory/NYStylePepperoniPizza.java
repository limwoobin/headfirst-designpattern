package factory;

import factory.ingredient.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        name = "NYStylePepperoniPizza";
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
        cheese = ingredientFactory.createCheese();
    }
}
