package com.shang.factorytest.simplefactory;

import com.shang.factorytest.IHamburger;

/**
 * @author: sjy
 * @create: 2019-03-09 13:59
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class HamburgerFactory {
    public IHamburger createHamburger(Class<? extends IHamburger> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
