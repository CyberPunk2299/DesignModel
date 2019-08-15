package designmode.templatemethod;

/**
 * @description: 建立一个抽象超类
 * @author: MuQinglin
 * @time: 2019/7/11 16:15
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater();//加水
        brew();//泡
        pourIncup();//倒杯子里
        if (customWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("正在加水");
    }

    void pourIncup() {
        System.out.println("");
    }

    boolean customWantsCondiments() {
        return true;
    }

}
