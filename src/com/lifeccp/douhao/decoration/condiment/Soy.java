package com.lifeccp.douhao.decoration.condiment;

import com.lifeccp.douhao.decoration.beverage.Beverage;

/**
 * Created by Administrator on 2018/6/25.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage ;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy" ;
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
