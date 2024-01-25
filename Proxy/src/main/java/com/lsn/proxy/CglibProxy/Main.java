package com.lsn.proxy.CglibProxy;

import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        RealProduct realProduct=new RealProduct();
        ProductMethodInterceptor interceptor=new ProductMethodInterceptor(realProduct);

        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(RealProduct.class);
        enhancer.setCallback(interceptor);

        RealProduct proxyProduct = (RealProduct) enhancer.create();
        proxyProduct.productTV();
        proxyProduct.repair();
    }
}
