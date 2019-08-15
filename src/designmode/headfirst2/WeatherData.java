package designmode.headfirst2;

import java.util.Observable;

/**
 * @description: 主题
 * @author: MuQinglin
 * @time: 2019/7/8 9:07
 */
public class WeatherData extends Observable {
    private float tempature;
    private float pressture;
    private float humidity;

    public WeatherData() {
    }

    ;

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float tempature, float pressture, float humidity) {
        this.tempature = tempature;
        this.pressture = pressture;
        this.humidity = humidity;
        measurementChanged();
    }

    public float getTempature() {
        return tempature;
    }

    public float getPressture() {
        return pressture;
    }

    public float getHumidity() {
        return humidity;
    }
}
