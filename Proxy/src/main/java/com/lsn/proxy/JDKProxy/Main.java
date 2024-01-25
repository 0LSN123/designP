package com.lsn.proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Product tar=new RealProduct();
        InvocationHandler handler =new ProductInvocationHandler(tar);
        Product proxyProduct = (Product) Proxy.newProxyInstance(RealProduct.class.getClassLoader(), RealProduct.class.getInterfaces(), handler);
        proxyProduct.productTV();
        proxyProduct.repair();

    }
}