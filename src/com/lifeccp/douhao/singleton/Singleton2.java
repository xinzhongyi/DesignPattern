package com.lifeccp.douhao.singleton;

/**
 * Created by Administrator on 2018/6/27.
 * 静态初始化时既会创建单类，不会出现现成安全问题
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2() ;

    private Singleton2(){} ;

    public static Singleton2 getInstance(){
        return uniqueInstance ;
    }
}
