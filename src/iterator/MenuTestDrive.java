package iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waiter waiter = new Waiter(pancakeHouseMenu , dinerMenu , cafeMenu);
        waiter.printMenu();
    }
}
