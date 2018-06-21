package com.lifeccp.douhao.StrategyPattern;

import com.lifeccp.douhao.StrategyPattern.behaviorImpl.FlyWithWings;
import com.lifeccp.douhao.StrategyPattern.behaviorImpl.Quack;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/21
 * Time: 17:33
 * Description:
 * \
 */
public class MallardDark extends Duck {

    public MallardDark(){
        quackBehavior = new Quack() ;
        flyBehavior = new FlyWithWings() ;
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
