package designmode.strategy;

/**
 * @description: 火箭飞
 * @author: MuQinglin
 * @time: 2019/7/10 9:23
 */
public class FlyWithRocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("我正在用火箭飞");
    }
}
