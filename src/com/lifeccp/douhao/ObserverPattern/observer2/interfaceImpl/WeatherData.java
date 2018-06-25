package com.lifeccp.douhao.ObserverPattern.observer2.interfaceImpl;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/25
 * Time: 18:20
 * Description:
 * \
 */
public class WeatherData extends Observable{
    private float temperature ;
    private float humidity ;
    private float pressure ;

    public WeatherData(){} ;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature ;
        this.humidity = humidity ;
        this.pressure = pressure ;
        measurementsChanged();
    }

    public float getTemperature(){
        return this.temperature ;
    }

    public float getHumidity(){
        return this.humidity ;
    }

    public float getPressure(){
        return this.pressure ;
    }
}
