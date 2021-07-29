package factory.ex1.abstractFactory;

public class ChicagoMeetPizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoMeetPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("ChicagoMeetPizza prepare");
        dough = pizzaIngredientFactory.createDough();
        source = pizzaIngredientFactory.createSource();
        cheese = pizzaIngredientFactory.createCheese();
        meet = pizzaIngredientFactory.createMeet();
    }
}
