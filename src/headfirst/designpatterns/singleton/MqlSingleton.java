package headfirst.designpatterns.singleton;

/**
 * @description: 单例模式
 * @author: rd_qinglin_mu
 * @create: 2023-02-08 15:56
 **/
public class MqlSingleton {
    //volatile关键字防止指令重排序
    private volatile static MqlSingleton mqlSingleton = null;


    private MqlSingleton() {
    }

    public static MqlSingleton getMqlSingleton() {
        //第一次判空
        if (mqlSingleton == null) {
            //锁整个类
            synchronized (MqlSingleton.class) {
                //二次判空
                if (mqlSingleton == null) {
                    mqlSingleton = new MqlSingleton();
                }
            }
        }
        return mqlSingleton;
    }

}
