package com.lifeccp.douhao.decoration.beverage;

import com.lifeccp.douhao.decoration.beverage.Beverage;

/**
 * Created by Administrator on 2018/6/25.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee" ;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
