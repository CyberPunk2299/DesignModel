package designmode.strategy;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/10 9:24
 */
public class QuackMiao implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("喵喵喵");
    }
}
