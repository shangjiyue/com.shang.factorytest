package com.shang.factorytest.simplefactory;

import com.shang.factorytest.IHamburger;
import com.shang.factorytest.KFCHamburger;
import com.shang.factorytest.MCHamburger;

/**
 * @author: sjy
 * @create: 2019-03-09 14:02
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class SimpleFactoryTest {
    public static void main(String[] args) {
        HamburgerFactory factory = new HamburgerFactory();
        IHamburger kcfHamburger = factory.createHamburger(KFCHamburger.class);
        kcfHamburger.eatHamburger();
        IHamburger mcHamburger = factory.createHamburger(MCHamburger.class);
        mcHamburger.eatHamburger();

    }
}
