package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 14:26
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class MCFriedChicken implements IFriedChicken {
    @Override
    public void eat() {
        System.out.println("麦当劳炸鸡");
    }
}
