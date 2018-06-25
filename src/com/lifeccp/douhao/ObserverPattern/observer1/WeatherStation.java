package com.lifeccp.douhao.ObserverPattern.observer1;

import com.lifeccp.douhao.ObserverPattern.observer1.interfaceImpl.CurrentConditionDisplay;
import com.lifeccp.douhao.ObserverPattern.observer1.interfaceImpl.StatisticsDisplay;
import com.lifeccp.douhao.ObserverPattern.observer1.interfaceImpl.WeatherData;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/25
 * Time: 17:56
 * Description:
 * \
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData() ;

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData) ;
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData) ;
        weatherData.setMeasurements(80,65,30.f);
        weatherData.setMeasurements(82,70,30.f);
        weatherData.setMeasurements(70,90,30.f);
    }
}
