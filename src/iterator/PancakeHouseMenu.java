package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B 팬케이크 세트" ,
                "스크램블 에그와 토스트가 곁들여진 팬케이크",
                true,
                2.99);

        addItem("레귤러 팬케이크 세트" ,
                "달걀 후라이와 소시지가 곁들여진 팬케이크",
                false,
                2.99);

        addItem("블루베리 팬케이크 세트" ,
                "스크램블 에그와 블루베리가 곁들여진 팬케이크",
                true,
                3.49);

        addItem("와플" ,
                "와플 , 취향에 따라 블루베리나 딸기를 얹을 수 있습니다",
                true,
                3.59);
    }

    public void addItem(String name , String description , boolean vegetarian , double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
