package designmode.decorator;

/**
 * @description: 装饰类 2
 * @author: MuQinglin
 * @time: 2019/7/9 16:33
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;//被装饰类

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 1.00 + beverage.cost();
    }
}
