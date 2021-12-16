package com.mukesh.designpattern.corejava.creational.singleton;

/**
 * @author Mukesh Bhoge
 **/
public class MySingleToneApp {
    public static void main(String[] args) {
        MySingleTone mySingleTone = MySingleTone.getInstance();
        System.out.println("Singleton Instance "+mySingleTone);
        try {
            mySingleTone.clone();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
