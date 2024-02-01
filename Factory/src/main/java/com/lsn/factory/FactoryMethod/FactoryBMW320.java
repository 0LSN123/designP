package com.lsn.factory.FactoryMethod;

public class FactoryBMW320 implements FactoryBMW{
    @Override
    public BMW creatBMW() {
        return new BWM320();
    }
}
