package com.lsn.chain;

public abstract class Support {
    private String name;
    private Support next;
    public Support(String name){
        this.name=name;
    }
    public Support setNext(Support next){
        this.next=next;
        return next;
    }

    public abstract boolean resolve(Trouble trouble);
    public void done(Trouble trouble){
        System.out.println(trouble+"问题已经解决");
    }
    public void fail(Trouble trouble){
        System.out.println(trouble+"问题没有解决");
    }
    //处理流程
    public final void support(Trouble trouble){
        if (resolve(trouble)){
            done(trouble);
        }else if (next!=null){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }
}
