package factory.ex1.abstractFactory;

import factory.ex1.abstractFactory.ingredient.Cheese;
import factory.ex1.abstractFactory.ingredient.Dough;
import factory.ex1.abstractFactory.ingredient.Meet;
import factory.ex1.abstractFactory.ingredient.Source;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Source createSource();
    public Cheese createCheese();
    public Meet createMeet();
}
