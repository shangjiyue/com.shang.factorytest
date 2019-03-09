package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 15:06
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ISnackFactory kfcFactory = new FKCSnackFactory();
        kfcFactory.createCola().drink();
        kfcFactory.createFriedChicken().eat();
    }
}
