package com.lifeccp.douhao.StrategyPattern.behaviorImpl;

import com.lifeccp.douhao.StrategyPattern.behavior.FlyBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/21
 * Time: 17:23
 * Description:
 * \
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
