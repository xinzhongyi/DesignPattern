package com.lifeccp.douhao.composite;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/13
 * Time: 9:37
 * Description:
 * \
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu= new Menu("PANCAKE HOUSE MENU","Breakfast") ;
        MenuComponent dinerMenu = new Menu("DINER MENU","Lunch") ;
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course") ;

        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined") ;

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        pancakeHouseMenu.add(new MenuItem(
                "Pasta1",
                "Spaghetti with Marianra1",
                true,
                3.89
        )) ;
        pancakeHouseMenu.add(new MenuItem(
                "Pasta2",
                "Spaghetti with Marianra2",
                true,
                3.89
        )) ;

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "DESSERT MENUITEM 1",
                "DESSERT with Marianra1",
                false,
                2.89
        )) ;

        Waitness waitness = new Waitness(allMenus) ;

//        waitness.printMenu();
        waitness.printVegetarianMenu();
    }
}
