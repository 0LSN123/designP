package com.lsn.proxy.JDKProxy;

public class RealProduct implements Product{


    @Override
    public void productTV() {
        System.out.println("生产电视");
    }

    @Override
    public void repair() {
        System.out.println("维修电视");
    }
}
