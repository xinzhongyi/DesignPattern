package com.lifeccp.douhao.StrategyPattern.behaviorImpl;

import com.lifeccp.douhao.StrategyPattern.behavior.QuackBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/21
 * Time: 17:29
 * Description:
 * \
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
