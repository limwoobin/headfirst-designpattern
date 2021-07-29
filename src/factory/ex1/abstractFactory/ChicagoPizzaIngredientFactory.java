package factory.ex1.abstractFactory;

import factory.ex1.abstractFactory.ingredient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ChicagoStyleDough();
    }

    @Override
    public Source createSource() {
        return new ChicagoStyleSource();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoStyleCheese();
    }

    @Override
    public Meet createMeet() {
        return new ChicagoStyleMeet();
    }
}
