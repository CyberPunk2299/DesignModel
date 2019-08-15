package designmode.decorator;

/**
 * @description: 装饰类 3
 * @author: MuQinglin
 * @time: 2019/7/9 16:35
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;//被装饰类

     Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 2.00 + beverage.cost();
    }
}
