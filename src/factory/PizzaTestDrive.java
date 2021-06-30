package factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStoreFactory factory = new PizzaStoreFactory();
        PizzaStore nyStore = factory.getPizzaStore(Store.NY);
        PizzaStore chicagoStore = factory.getPizzaStore(Store.CHICAGO);

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName());
    }
}
