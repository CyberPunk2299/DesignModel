package designmode.singleton;

/**
 * @description: 饿汉式
 * @author: MuQinglin
 * @time: 2019/7/8 19:59
 */
public class Singleton {

    //防止指令重排序，因为instance = new Singleton()不是原子操作
    private volatile static Singleton instance = null;
    private Singleton(){}

    //比较完美的写法
    public static Singleton getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (Singleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
