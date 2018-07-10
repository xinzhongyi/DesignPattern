package com.lifeccp.douhao.adapter;

import com.lifeccp.douhao.StrategyPattern.MallardDark;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 13:58
 * Description:
 * \
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck() ;

        WildTurkey turkey = new WildTurkey() ;
        Duck turkeyAdapter = new TurkeyAdapter(turkey) ;

        testDuck(duck);

        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
