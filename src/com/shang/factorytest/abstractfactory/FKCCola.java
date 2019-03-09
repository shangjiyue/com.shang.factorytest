package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 14:22
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class FKCCola implements ICola {
    @Override
    public void drink() {
        System.out.println("肯德基百事可乐");
    }
}
