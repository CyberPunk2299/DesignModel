package designmode.decorator;

/**
 * @description: 测试类
 * @author: MuQinglin
 * @time: 2019/7/9 16:37
 */
public class CoffeeTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("当前消费为: " + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + "当前消费为: " + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + "当前消费为: " + beverage.cost());

        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + "当前消费为: " + beverage.cost());

        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + "当前消费为: " + beverage.cost());

    }
}
