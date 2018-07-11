package com.lifeccp.douhao.Iterator;

/**
 * Created by Administrator on 2018/7/11.
 */
public class Waitress {
    Menu pancakeHoushMenu ;
    Menu dinerMenu ;

    public Waitress(Menu pancakeHoushMenu, Menu dinerMenu) {
        this.pancakeHoushMenu = pancakeHoushMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        MyIterator pancakeIterator = pancakeHoushMenu.createIterator() ;
        MyIterator dinerIterator = dinerMenu.createIterator() ;
        System.out.println("Menu\n ----- \nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(MyIterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }
}
