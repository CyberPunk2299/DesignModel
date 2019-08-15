package designmode.decorator;

/**
 * @description: 装饰类1
 * @author: MuQinglin
 * @time: 2019/7/9 16:30
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;//被装饰类

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
