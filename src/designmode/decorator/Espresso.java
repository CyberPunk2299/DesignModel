package designmode.decorator;

/**
 * @description: 子类
 * @author: MuQinglin
 * @time: 2019/7/9 16:28
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
