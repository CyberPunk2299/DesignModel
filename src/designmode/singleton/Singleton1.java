package designmode.singleton;

/**
 * @description: 懒汉式
 * @author: MuQinglin
 * @time: 2019/7/8 20:02
 */
public class Singleton1 {
    private volatile static Singleton1 singleton1;

    private Singleton1() {
    }

    ;

    public static Singleton1 getSingleton() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
