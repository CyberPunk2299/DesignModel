package designmode.factory.abstractfactory;

/**
 * @description: 实际工厂2
 * @author: rd_qinglin_mu
 * @create: 2023-02-04 11:25
 **/
public class BlackAnimalFactory implements IAnimalFactory{
    public ICat createCat() {
        return new BlackCat();
    }
    public IDog createDog() {
        return new BlackDog();
    }
}
