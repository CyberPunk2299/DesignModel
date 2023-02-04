package designmode.factory.abstractfactory;

/**
 * @description: 实际产品2
 * @author: rd_qinglin_mu
 * @create: 2023-02-04 11:22
 **/
public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The white cat is eating!");
    }
}