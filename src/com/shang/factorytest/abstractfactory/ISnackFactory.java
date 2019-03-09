package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 14:21
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public interface ISnackFactory {
    ICola createCola();

    IFriedChicken createFriedChicken();
}
