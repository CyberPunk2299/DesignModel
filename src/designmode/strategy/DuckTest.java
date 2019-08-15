package designmode.strategy;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/10 9:25
 */
public class DuckTest {
    public static void main(String[] args) {
        GreenDuck greenDuck = new GreenDuck();
        greenDuck.peformFly();
        greenDuck.setFlyBehaviour(new FlyWithRocket());
        greenDuck.peformFly();
        greenDuck.display();
    }
}
