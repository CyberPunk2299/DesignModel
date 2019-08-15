package designmode.factory.factorymethod;

import designmode.factory.simplefactory.bean.Benz;
import designmode.factory.simplefactory.bean.Bmw;
import designmode.factory.simplefactory.bean.Car;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/10 10:29
 */
public class FullPowerDriver implements Driver {
    @Override
    public Car driverCar() {
        return driveCar("benz");
    }

    public Car driveCar(String s) {
        if (s.equalsIgnoreCase("benz")) {
            return new Benz();
        } else if (s.equalsIgnoreCase("bmw")) {
            return new Bmw();
        } else {
            return null;
        }
    }
}
