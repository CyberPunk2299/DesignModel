package designmode.headfirst2;

/**
 * @description: 测试类
 * @author: MuQinglin
 * @time: 2019/7/8 9:23
 */
public class WeatherDataTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TempatureDisplay tempatureDisplay = new TempatureDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);
        weatherData.setMeasurements(1, 1, 1);
        weatherData.setMeasurements(2, 2, 2);
    }
}
