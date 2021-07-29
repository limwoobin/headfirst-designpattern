package factory.ex1.abstractFactory;

import factory.ex1.abstractFactory.ingredient.Cheese;
import factory.ex1.abstractFactory.ingredient.Dough;
import factory.ex1.abstractFactory.ingredient.Meet;
import factory.ex1.abstractFactory.ingredient.Source;

public abstract class Pizza {
    Dough dough;
    Source source;
    Meet meet;
    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println(dough.getClass().getName() + " Bake");
    }

    void cut() {
        System.out.println(source.getClass().getName() + "," + meet.getClass().getName() + "," + cheese.getClass().getName() + " Cutting");
    }

    void box() {
        System.out.println("Box...");
    }
}
