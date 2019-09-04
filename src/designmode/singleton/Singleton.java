package designmode.singleton;

/**
 * @description: 饿汉式
 * @author: MuQinglin
 * @time: 2019/7/8 19:59
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }


    public static Singleton getInstance() {
        return singleton;
    }

}
