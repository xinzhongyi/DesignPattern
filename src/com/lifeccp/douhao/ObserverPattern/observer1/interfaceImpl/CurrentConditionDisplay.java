package com.lifeccp.douhao.ObserverPattern.observer1.interfaceImpl;


import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.DisplayElement;
import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.MyObserver;
import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.MySubject;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/25
 * Time: 17:52
 * Description:
 * \
 */
public class CurrentConditionDisplay implements MyObserver,DisplayElement {

    private float temperature ;
    private float humidity ;
    private MySubject weatherData ;

    public CurrentConditionDisplay(MySubject weatherData) {
        this.weatherData = weatherData ;
        weatherData.registerObserver(this) ;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp ;
        this.humidity = humidity ;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
