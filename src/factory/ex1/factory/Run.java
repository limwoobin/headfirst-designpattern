package factory.ex1.factory;

public class Run {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("meet");
        
        // PizzaStore 를 선택하는 과정에서 Factory Method 를 사용하여 PizzaStore 를 선택할 수도 있음
    }
}
