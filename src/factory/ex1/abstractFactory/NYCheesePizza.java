package factory.ex1.abstractFactory;

public class NYCheesePizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("NYCheesePizza prepare");
        dough = pizzaIngredientFactory.createDough();
        source = pizzaIngredientFactory.createSource();
        cheese = pizzaIngredientFactory.createCheese();
        meet = pizzaIngredientFactory.createMeet();
    }
}
