package com.shang.factorytest.factorymethod;

import com.shang.factorytest.IHamburger;
import com.shang.factorytest.KFCHamburger;

/**
 * @author: sjy
 * @create: 2019-03-09 14:07
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class FKCHamburgerFactory implements IHamburgerFactory {
    @Override
    public IHamburger create() {
        return new KFCHamburger();
    }
}
