package com.lsn.factory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        String type="A";
        Product product=SimpleFactory.creatProduct(type);
        product.showProduct();
    }
}