package com.lsn.adapter;

public class chargeAdaptee implements Adaptee{

    @Override
    public void chargeBy110V() {
        System.out.println("电压110V正在输出");
    }
}
