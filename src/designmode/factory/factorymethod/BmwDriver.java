package designmode.factory.factorymethod;

import designmode.factory.simplefactory.bean.*;

/**
 * @description: 工厂角色1
 * @author: MuQinglin
 * @time: 2019/7/9 9:37
 */
public class BmwDriver implements Driver {
    @Override
    public Car driverCar() {
        return new Bmw();
    }
}
