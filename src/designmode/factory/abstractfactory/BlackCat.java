package designmode.factory.abstractfactory;

/**
 * @description: 实际产品4
 * @author: rd_qinglin_mu
 * @create: 2023-02-04 11:23
 **/
public class BlackCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
}
