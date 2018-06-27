package com.lifeccp.douhao.singleton;

/**
 * Created by Administrator on 2018/6/27.
 *  单例模式 多线程下会出现问题
 *  饿汉
 */
public class Singleton {
    private static Singleton uniqueInstance ;

    private Singleton(){} ;

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton() ;
        }
        return uniqueInstance ;
    }
}
