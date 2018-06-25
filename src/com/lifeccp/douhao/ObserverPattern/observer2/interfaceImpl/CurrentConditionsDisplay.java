package com.lifeccp.douhao.ObserverPattern.observer2.interfaceImpl;

import com.lifeccp.douhao.ObserverPattern.observer1.interfacePackage.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/25
 * Time: 18:24
 * Description:
 * \
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable ;
    private float temperature ;
    private float humidity ;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable ;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature() ;
            this.humidity = weatherData.getHumidity() ;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" );
    }
}
