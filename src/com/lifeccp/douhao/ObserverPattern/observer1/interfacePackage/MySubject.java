package com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage;

/**
 * Created by sks on 2018/6/25.
 */
public interface MySubject {
    //注册观察者
    public void registerObserver(MyObserver o) ;
    //移除观察者
    public void removerObserver(MyObserver o) ;
    //通知所有观察者
    public void notifyObservers() ;
}
