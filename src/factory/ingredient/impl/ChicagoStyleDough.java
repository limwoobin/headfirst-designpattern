package factory.ingredient.impl;

import factory.ingredient.Dough;

public class ChicagoStyleDough implements Dough {
    public ChicagoStyleDough() {
        System.out.println(this.getClass().getName());
    }
}
