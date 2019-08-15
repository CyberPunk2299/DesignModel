package designmode.factory.simplefactory.bean;

/**
 * @description: 工厂角色
 * @author: MuQinglin
 * @time: 2019/7/9 9:28
 */
public class Driver {
    public static Car driverCar(String str) throws Exception {
        if (str.equalsIgnoreCase("Benz")) {
            return new Benz();
        } else if (str.equalsIgnoreCase("Bmv")) {
            return new Bmw();
        } else throw new Exception();
    }

}
