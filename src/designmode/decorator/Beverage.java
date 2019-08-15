package designmode.decorator;

/**
 * @description: 咖啡抽象超类
 * @author: MuQinglin
 * @time: 2019/7/9 16:25
 */
public abstract class Beverage {
    String description = "Unknown description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
