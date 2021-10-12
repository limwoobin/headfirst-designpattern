package composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");

        MenuComponent allMenus = new Menu("전체 메뉴" , "전체 메뉴");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B 팬케이크 세트" ,
                "스크램블 에그와 토스트가 곁들여진 팬케이크",
                true,
                2.99));

        pancakeHouseMenu.add(new MenuItem("레귤러 팬케이크 세트" ,
                "달걀 후라이와 소시지가 곁들여진 팬케이크",
                false,
                2.99));

        pancakeHouseMenu.add(new MenuItem("블루베리 팬케이크 세트" ,
                "스크램블 에그와 블루베리가 곁들여진 팬케이크",
                true,
                3.49));

        pancakeHouseMenu.add(new MenuItem("와플" ,
                "와플 , 취향에 따라 블루베리나 딸기를 얹을 수 있습니다",
                true,
                3.59));


        dinerMenu.add(new MenuItem("채식주의자용 BLT",
                "식물성 베이컨 , 상추 , 토마토를 얹은 메뉴" , true , 2.99));

        dinerMenu.add(new MenuItem("BLT",
                "베이컨 , 상추 , 토마토를 얹은 메뉴" , false , 2.99));

        dinerMenu.add(new MenuItem("핫도그",
                "사워크라우드 , 각종 양념 , 토마토를 얹은 메뉴" , false , 3.29));

        dinerMenu.add(new MenuItem("오늘의 수프",
                "양송이 , 채소 , 토마토를 얹은 메뉴" , false , 3.05));


        cafeMenu.add(new MenuItem("베지 버거와 에어프라이",
                "통밀빵 , 상추 , 토마토가 첨가된 버거",
                true,
                3.99));

        cafeMenu.add(new MenuItem("오늘의 수프",
                "샐러드가 첨가된 수프",
                false,
                3.69));

        cafeMenu.add(new MenuItem("베리또",
                "콩 , 핀토콩과 살사가 첨가된 베리또",
                true,
                4.29));

        Waiter waiter = new Waiter(allMenus);
        waiter.printMenu();
    }
}
