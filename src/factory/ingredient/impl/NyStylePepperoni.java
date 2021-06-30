package factory.ingredient.impl;

import factory.ingredient.Pepperoni;

public class NyStylePepperoni implements Pepperoni {
    public NyStylePepperoni() {
        System.out.println(this.getClass().getName());
    }
}
