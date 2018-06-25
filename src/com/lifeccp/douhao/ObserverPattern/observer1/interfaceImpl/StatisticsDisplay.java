package com.lifeccp.douhao.ObserverPattern.observer1.interfaceImpl;

import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.DisplayElement;
import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.MyObserver;
import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.MySubject;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/25
 * Time: 17:58
 * Description:
 * \
 */
public class StatisticsDisplay implements MyObserver,DisplayElement {
    private float temperature ;
    private float humidity ;
    private float pressure ;
    private MySubject weatherData ;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp ;
        this.humidity = humidity ;
        this.pressure = pressure ;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics display: " + "temperature=" + this.temperature + " humidity= " + this.humidity + " pressure= " + this.pressure);
    }
}
