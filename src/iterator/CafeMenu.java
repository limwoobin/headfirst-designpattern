package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    private Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("베지 버거와 에어프라이",
                "통밀빵 , 상추 , 토마토가 첨가된 버거",
                true,
                3.99);

        addItem("오늘의 수프",
                "샐러드가 첨가된 수프",
                false,
                3.69);

        addItem("베리또",
                "콩 , 핀토콩과 살사가 첨가된 베리또",
                true,
                4.29);
    }

    public void addItem(String name , String description , boolean vegetarian , double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName() , menuItem);
    }

    public Hashtable getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
