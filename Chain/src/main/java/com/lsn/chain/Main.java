package com.lsn.chain;

public class Main {
    public static void main(String[] args) {
        Support A=new NoSupport("A");
        Support B=new LimitSupport("B",20);
        Support C=new OddSupport("C");
        A.setNext(B).setNext(C);
        for (int i=0;i<30;i+=6){
            A.support(new Trouble(i));
        }
    }
}