package designmode.factory.factorymethod;

import designmode.factory.simplefactory.bean.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/9 9:41
 */
public class Magnate {
    public static void main(String[] args) {
        try {
            Driver driver = new FullPowerDriver();
            Car car = driver.driverCar();
            car.drive();
        } catch (Exception e) {
            System.out.println("asd as ");
        }
    }
}
