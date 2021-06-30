package factory.ingredient.impl;

import factory.ingredient.Pepperoni;

public class ChicagoStylePepperoni implements Pepperoni {
    public ChicagoStylePepperoni() {
        System.out.println(this.getClass().getName());
    }
}
