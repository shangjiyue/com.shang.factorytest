package com.shang.factorytest.factorymethod;

import com.shang.factorytest.IHamburger;

/**
 * @author: sjy
 * @create: 2019-03-09 14:10
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class FactoryMethodTest {
    public static void main(String[] args) {

        IHamburgerFactory factory = new FKCHamburgerFactory();
        IHamburger hamburger = factory.create();
        hamburger.eatHamburger();

        factory = new MCHamburgerFactory();
        hamburger = factory.create();
        hamburger.eatHamburger();
    }
}
