package designmode.headfirst2;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 观察者1
 * @author: MuQinglin
 * @time: 2019/7/8 9:25
 */
public class PressureDisplay implements Display, Observer {
    Observable observable;
    float pressure;

    public PressureDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("PressureDisplay: " + "pressure " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.pressure = weatherData.getPressture();
            display();
        }
    }


}
