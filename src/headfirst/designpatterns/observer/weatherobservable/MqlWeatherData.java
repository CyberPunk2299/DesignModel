package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;

/**
 * @description: 自建测试用类
 * @author: rd_qinglin_mu
 * @create: 2023-02-07 21:40
 **/
public class MqlWeatherData extends Observable {
    //继承Observa之后，无需写任何方法

    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


    public void dataChanged() {
        setChanged();
        notifyObservers();
    }
}
