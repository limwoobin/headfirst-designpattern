package factory.ingredient.impl;

import factory.ingredient.Sauce;

public class ChicagoStyleSauce implements Sauce {
    public ChicagoStyleSauce() {
        System.out.println(this.getClass().getName());
    }
}
