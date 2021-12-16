package com.mukesh.designpattern.corejava.creational.singleton;

/**
 * @author Mukesh Bhoge
 **/
public class MySingleTone implements  Cloneable {
    private static MySingleTone mySingleTone;

    private MySingleTone() {
    }

    public static  MySingleTone getInstance(){
        synchronized (MySingleTone.class){
            if (null == mySingleTone){
                mySingleTone = new MySingleTone();
            }
        }
        return  mySingleTone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException(" !!! Clone not supported !!! ");
    }
}
