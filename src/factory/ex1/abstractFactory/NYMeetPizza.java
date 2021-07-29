package factory.ex1.abstractFactory;

public class NYMeetPizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NYMeetPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        source = pizzaIngredientFactory.createSource();
        cheese = pizzaIngredientFactory.createCheese();
        meet = pizzaIngredientFactory.createMeet();
    }
}
