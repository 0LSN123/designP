package com.lsn.factory.FactoryMethod;

public class FactoryBMW523 implements FactoryBMW{
   @Override
    public BMW creatBMW(){
        return new BMW523();
    }
}
