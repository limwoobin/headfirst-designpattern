package factory.ex1.abstractFactory;

public class ChicagoSupremePizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoSupremePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("ChicagoSupremePizza prepare");
        dough = pizzaIngredientFactory.createDough();
        source = pizzaIngredientFactory.createSource();
        cheese = pizzaIngredientFactory.createCheese();
        meet = pizzaIngredientFactory.createMeet();
    }
}
