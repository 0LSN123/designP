package com.lsn.factory.SimpleFactory;

public class SimpleFactory {
    public static Product creatProduct(String type){
        switch (type){
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new RuntimeException("不存在");
        }
    }
}
