package factory.ingredient;

import factory.ingredient.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NyStyleDough();
    }

    @Override
    public Sauce createSauce() {
        return new NyStyleSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NyStyleCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NyStylePepperoni();
    }

    @Override
    public Clams createClams() {
        return new NyStyleClams();
    }
}
