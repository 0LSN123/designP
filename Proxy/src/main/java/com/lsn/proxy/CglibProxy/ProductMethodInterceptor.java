package com.lsn.proxy.CglibProxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProductMethodInterceptor implements MethodInterceptor {
    private final Object target;

    public ProductMethodInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Before"+method.getName()+"product");
        Object res =proxy.invokeSuper(obj,args);
        System.out.println("After"+method.getName()+"product");

        return res;
    }
}
