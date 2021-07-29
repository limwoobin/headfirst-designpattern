package factory.ex1.abstractFactory;

import factory.ex1.abstractFactory.ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NyStyleDough();
    }

    @Override
    public Source createSource() {
        return new NyStyleSource();
    }

    @Override
    public Cheese createCheese() {
        return new NyStyleCheese();
    }

    @Override
    public Meet createMeet() {
        return new NyStyleMeet();
    }
}
