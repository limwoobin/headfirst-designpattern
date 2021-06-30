package factory.ingredient.impl;

import factory.ingredient.Dough;

public class NyStyleDough implements Dough {
    public NyStyleDough() {
        System.out.println(this.getClass().getName());
    }
}
