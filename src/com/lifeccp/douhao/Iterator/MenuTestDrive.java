package com.lifeccp.douhao.Iterator;

/**
 * Created by Administrator on 2018/7/11.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHoushMenu pancakeHoushMenu = new PancakeHoushMenu() ;
        DinerMenu dinerMenu = new DinerMenu() ;

        Waitress waitress = new Waitress(pancakeHoushMenu,dinerMenu) ;

        waitress.printMenu();
    }
}
