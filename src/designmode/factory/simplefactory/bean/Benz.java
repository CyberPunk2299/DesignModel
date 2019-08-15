package designmode.factory.simplefactory.bean;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/9 9:27
 */
public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("我在开奔驰");
    }
}
