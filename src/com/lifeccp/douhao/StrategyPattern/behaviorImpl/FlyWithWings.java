package com.lifeccp.douhao.StrategyPattern.behaviorImpl;

import com.lifeccp.douhao.StrategyPattern.behavior.FlyBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/21
 * Time: 17:22
 * Description:
 * \
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!") ;
    }
}
