package designmode.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 具体子类
 * @author: MuQinglin
 * @time: 2019/7/11 16:18
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("正在泡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    public boolean customWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("你想加点牛奶吗？");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO ERROR please read your input again");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
