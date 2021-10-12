package iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT",
                "식물성 베이컨 , 상추 , 토마토를 얹은 메뉴" , true , 2.99);

        addItem("BLT",
                "베이컨 , 상추 , 토마토를 얹은 메뉴" , false , 2.99);

        addItem("핫도그",
                "사워크라우드 , 각종 양념 , 토마토를 얹은 메뉴" , false , 3.29);

        addItem("오늘의 수프",
                "양송이 , 채소 , 토마토를 얹은 메뉴" , false , 3.05);
    }

    public void addItem(String name , String description , boolean vegetarian , double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("메뉴가 꽉차 더 이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
