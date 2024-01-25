package com.lsn.proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProductInvocationHandler implements InvocationHandler {
    private final Object target;
    public ProductInvocationHandler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before"+method.getName()+"product");
        Object res=method.invoke(target, args);
        System.out.println("After"+method.getName()+"product");
        return res;
    }
}
