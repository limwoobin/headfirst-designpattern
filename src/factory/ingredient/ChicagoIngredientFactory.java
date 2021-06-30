package factory.ingredient;

import factory.ingredient.impl.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoStyleDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoStyleSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoStyleCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoStylePepperoni();
    }

    @Override
    public Clams createClams() {
        return new ChicagoStyleClams();
    }
}
