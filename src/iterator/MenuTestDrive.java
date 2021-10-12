package iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waiter waiter = new Waiter(pancakeHouseMenu , dinerMenu);
        waiter.printMenu();
    }
}
