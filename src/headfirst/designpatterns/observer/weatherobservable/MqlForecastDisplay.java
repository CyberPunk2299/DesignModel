package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 做习题
 * @author: rd_qinglin_mu
 * @create: 2023-02-07 21:50
 **/
public class MqlForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public MqlForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
        }
    }

    @Override
    public void display() {
        //
        System.out.println("打印");
    }
}
