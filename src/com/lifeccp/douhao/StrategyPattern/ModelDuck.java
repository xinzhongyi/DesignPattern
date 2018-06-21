package com.lifeccp.douhao.StrategyPattern;

import com.lifeccp.douhao.StrategyPattern.behaviorImpl.FlyNoWay;
import com.lifeccp.douhao.StrategyPattern.behaviorImpl.Quack;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/21
 * Time: 17:41
 * Description:
 * \
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay() ;
        quackBehavior = new Quack() ;
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
