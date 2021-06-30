package factory;

import factory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        name = "ChicagoStyleClamPizza";
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
        cheese = ingredientFactory.createCheese();
    }
}
