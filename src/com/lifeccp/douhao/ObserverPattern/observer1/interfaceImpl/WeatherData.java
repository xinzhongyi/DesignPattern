package com.lifeccp.douhao.ObserverPattern.observer1.interfaceImpl;

import com.lifeccp.douhao.ObserverPattern.observer1.interfaceImpl.CurrentConditionDisplay;
import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.MyObserver;
import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.MySubject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/25
 * Time: 17:47
 * Description:
 * \
 */
public class WeatherData implements MySubject {
    private ArrayList<MyObserver> observers ;
    private float temperature ;
    private float humidity ;
    private float pressure ;

    public WeatherData() {
        observers = new ArrayList<>() ;
    }

    @Override
    public void registerObserver(MyObserver o) {
        observers.add(o) ;
    }

    @Override
    public void removerObserver(MyObserver o) {
        int i = observers.indexOf(o) ;
        if(i >= 0){
            observers.remove(i) ;
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(temperature,humidity,pressure);
        });
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature ;
        this.humidity = humidity ;
        this.pressure = pressure ;
        this.measurementsChanged();
    }
}
