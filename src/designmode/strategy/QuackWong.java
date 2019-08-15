package designmode.strategy;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/10 9:23
 */
public class QuackWong implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("汪汪汪");
    }
}
