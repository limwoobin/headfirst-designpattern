package factory.ingredient.impl;

import factory.ingredient.Sauce;

public class NyStyleSauce implements Sauce {
    public NyStyleSauce() {
        System.out.println(this.getClass().getName());
    }
}
