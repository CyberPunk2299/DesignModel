package designmode.prototype;

/**
 * @description: 原型类，实现Cloneable接口
 * @author: rd_qinglin_mu
 * @create: 2023-02-04 14:40
 **/
public class Prototype implements Cloneable{
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public Object clone(){
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
