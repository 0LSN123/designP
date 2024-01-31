package com.lsn.chain;

public class LimitSupport extends Support{
    private final int limit;
    public LimitSupport(String name,int limit) {
        super(name);
        this.limit=limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
