package factory.ingredient.impl;

import factory.ingredient.Cheese;

public class ChicagoStyleCheese implements Cheese {
    public ChicagoStyleCheese() {
        System.out.println(this.getClass().getName());
    }
}
