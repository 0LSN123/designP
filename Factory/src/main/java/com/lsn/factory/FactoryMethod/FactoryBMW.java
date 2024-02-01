package com.lsn.factory.FactoryMethod;

public interface FactoryBMW {
    default BMW creatBMW() {
        return null;
    }
}
