package designmode.factory.factorymethod;

import designmode.factory.simplefactory.bean.Car;
import designmode.factory.simplefactory.bean.*;

/**
 * @description: 工厂角色2
 * @author: MuQinglin
 * @time: 2019/7/9 9:36
 */
public class BenzDriver implements Driver {
    @Override
    public Car driverCar() {
        return new Benz();
    }
}
