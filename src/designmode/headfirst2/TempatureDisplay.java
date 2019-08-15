package designmode.headfirst2;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 观察者2
 * @author: MuQinglin
 * @time: 2019/7/8 9:15
 */
public class TempatureDisplay implements Observer, Display {
    Observable observable;//主题类
    private float tempature;
    private float pressure;

    public TempatureDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.tempature = weatherData.getTempature();
            this.pressure = weatherData.getPressture();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("TempatureDisplay: " + "tempature " + tempature + ", pressure " + pressure);
    }
}
