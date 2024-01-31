package com.lsn.adapter;

public class Adapter implements Target {
    Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }


    @Override
    public void chargeBy220V() {
        adaptee.chargeBy110V();
        System.out.println("增加110V，达到220V");
    }
}
