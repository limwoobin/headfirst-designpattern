package factory.ex1.abstractFactory;

public class NYSupremePizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NYSupremePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("NYSupremePizza prepare");
        dough = pizzaIngredientFactory.createDough();
        source = pizzaIngredientFactory.createSource();
        cheese = pizzaIngredientFactory.createCheese();
        meet = pizzaIngredientFactory.createMeet();
    }

}
