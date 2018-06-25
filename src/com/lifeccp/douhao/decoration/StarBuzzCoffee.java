package com.lifeccp.douhao.decoration;

import com.lifeccp.douhao.decoration.beverage.Beverage;
import com.lifeccp.douhao.decoration.beverage.DarkRoast;
import com.lifeccp.douhao.decoration.beverage.Espresso;
import com.lifeccp.douhao.decoration.beverage.HouseBlend;
import com.lifeccp.douhao.decoration.condiment.Mocha;
import com.lifeccp.douhao.decoration.condiment.Soy;
import com.lifeccp.douhao.decoration.condiment.Whip;

/**
 * Created by Administrator on 2018/6/25.
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso() ;
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast() ;
        beverage2 = new Mocha(beverage2) ;
        beverage2 = new Mocha(beverage2) ;
        beverage2 = new Whip(beverage2) ;
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend() ;
        beverage3 = new Soy(beverage3) ;
        beverage3 = new Mocha(beverage3) ;
        beverage3 = new Whip(beverage3) ;
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
