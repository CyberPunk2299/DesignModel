package designmode.factory.abstractfactory;

/**
 * @description: 实际产品3
 * @author: rd_qinglin_mu
 * @create: 2023-02-04 11:22
 **/
public class BlackDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The black dog is eating");
    }
}
