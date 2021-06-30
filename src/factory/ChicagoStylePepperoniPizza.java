package factory;

import factory.ingredient.PizzaIngredientFactory;

public class ChicagoStylePepperoniPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        name = "ChicagoStylePepperoniPizza";
        System.out.println("Prepare: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
        cheese = ingredientFactory.createCheese();
    }
}
