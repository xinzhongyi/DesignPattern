package com.lifeccp.douhao.StrategyPattern;

import com.lifeccp.douhao.StrategyPattern.behavior.FlyBehavior;
import com.lifeccp.douhao.StrategyPattern.behaviorImpl.FlyNoWay;
import com.lifeccp.douhao.StrategyPattern.behaviorImpl.FlyRocketPowered;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/21
 * Time: 17:35
 * Description:
 * \
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDark() ;
        mallard.performFly();
        mallard.performQuack();
        FlyBehavior fb = new FlyNoWay() ;
        mallard.setFlyBehavior(fb);
        mallard.performFly();

        Duck model = new ModelDuck() ;
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
