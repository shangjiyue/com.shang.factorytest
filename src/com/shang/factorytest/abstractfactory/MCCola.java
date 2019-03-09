package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 14:24
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class MCCola implements ICola {
    @Override
    public void drink() {
        System.out.println("麦当劳可口可乐");
    }
}
