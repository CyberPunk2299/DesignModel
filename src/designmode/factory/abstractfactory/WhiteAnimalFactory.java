package designmode.factory.abstractfactory;

/**
 * @description: 实际工厂1
 * @author: rd_qinglin_mu
 * @create: 2023-02-04 11:24
 **/
public class WhiteAnimalFactory implements IAnimalFactory {
    public ICat createCat() {
        return new WhiteCat();
    }
    public IDog createDog() {
        return new WhiteDog();
    }
}
