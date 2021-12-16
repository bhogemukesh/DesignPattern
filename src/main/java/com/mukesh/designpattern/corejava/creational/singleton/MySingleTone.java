package com.mukesh.designpattern.corejava.creational.singleton;

import java.io.Serializable;

/**
 * @author Mukesh Bhoge
 **/
public class MySingleTone implements  Cloneable , Serializable {
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
    // To avoid cloning of object
    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException(" !!! Clone not supported !!! ");
    }

    // To avoid Serialization issue
    protected Object readResolve()
    {
        return mySingleTone;
    }
}
