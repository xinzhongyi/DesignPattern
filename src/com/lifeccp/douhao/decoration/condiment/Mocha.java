package com.lifeccp.douhao.decoration.condiment;

import com.lifeccp.douhao.decoration.beverage.Beverage;

/**
 * Created by Administrator on 2018/6/25.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage ;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha" ;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
