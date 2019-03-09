package com.shang.factorytest.abstractfactory;

/**
 * @author: sjy
 * @create: 2019-03-09 15:04
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class FKCSnackFactory implements ISnackFactory {
    @Override
    public ICola createCola() {
        return new FKCCola();
    }

    @Override
    public IFriedChicken createFriedChicken() {
        return new FKCFriedChicken();
    }
}
