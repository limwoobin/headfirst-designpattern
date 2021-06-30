package factory;

public class PizzaStoreFactory {
    public PizzaStore getPizzaStore(Store store) {
        if (store == Store.NY) {
            return new NYPizzaStore();
        } else if (store == Store.CHICAGO) {
            return new ChicagoPizzaStore();
        } else {
            return null;
        }
    }
}
