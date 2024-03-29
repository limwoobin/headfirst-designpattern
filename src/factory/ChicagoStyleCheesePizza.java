package factory;

import factory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        name = "ChicagoStyleCheesePizza";
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    void cut() {
        System.out.println("Cutting the Pizza into square slices");
    }
}
