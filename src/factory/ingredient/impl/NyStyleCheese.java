package factory.ingredient.impl;

import factory.ingredient.Cheese;

public class NyStyleCheese implements Cheese {
    public NyStyleCheese() {
        System.out.println(this.getClass().getName());
    }
}
