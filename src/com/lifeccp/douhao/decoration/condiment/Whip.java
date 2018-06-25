package com.lifeccp.douhao.decoration.condiment;

import com.lifeccp.douhao.decoration.beverage.Beverage;

/**
 * Created by Administrator on 2018/6/25.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage ;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip" ;
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
