package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 14:25
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class FKCFriedChicken implements IFriedChicken {
    @Override
    public void eat() {
        System.out.println("肯德基炸鸡");
    }
}
