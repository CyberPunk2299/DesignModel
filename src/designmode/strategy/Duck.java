package designmode.strategy;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/10 9:18
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }


    public Duck() {
    }

    ;

    public void peformFly() {
        if (flyBehaviour == null) {
            System.out.println("鸭子还不会飞");
        } else {
            flyBehaviour.fly();
        }

    }

    public void peformQuack() {
        if (quackBehaviour == null) {
            System.out.println("鸭子还不会叫");
        } else {
            quackBehaviour.quack();
        }
    }

    public abstract void display();

    public void swim() {
        System.out.println("我他妈会游泳啦！！！");
    }

}
