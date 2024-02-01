package com.lsn.factory.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryBMW523 factoryBMW523=new FactoryBMW523();
        BMW bmw523=factoryBMW523.creatBMW();
        bmw523.showBMW();

        FactoryBMW320 factoryBMW320=new FactoryBMW320();
        BMW bmw320=factoryBMW320.creatBMW();
        bmw320.showBMW();
    }
}
