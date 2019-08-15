package designmode.strategy;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/10 9:22
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("我正在用翅膀飞");
    }
}
