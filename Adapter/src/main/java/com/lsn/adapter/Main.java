package com.lsn.adapter;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee=new chargeAdaptee();
        Adapter adapter=new Adapter(adaptee);
        adapter.chargeBy220V();

    }
}