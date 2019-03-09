package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 15:05
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class MCSnackFactory implements ISnackFactory {
    @Override
    public ICola createCola() {
        return new MCCola();
    }

    @Override
    public IFriedChicken createFriedChicken() {
        return new MCFriedChicken();
    }
}
