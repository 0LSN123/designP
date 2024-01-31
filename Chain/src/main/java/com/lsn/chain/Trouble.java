package com.lsn.chain;

public class Trouble {
    public int number;
    public Trouble(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
    public String toString(){
        return "Trouble "+number;
    }
}
