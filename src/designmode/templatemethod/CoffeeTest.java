package designmode.templatemethod;

/**
 * @description:测试类
 * @author: MuQinglin
 * @time: 2019/7/11 16:23
 */
public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
