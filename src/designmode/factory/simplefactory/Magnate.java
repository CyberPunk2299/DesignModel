package designmode.factory.simplefactory;

import designmode.factory.simplefactory.bean.*;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/9 9:30
 */
public class Magnate {
    public static void main(String[] args) throws Exception {
        Car car = Driver.driverCar("benz");
        car.drive();

    }
}
