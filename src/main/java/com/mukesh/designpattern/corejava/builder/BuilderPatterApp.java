package com.mukesh.designpattern.corejava.builder;

/**
 * @author Mukesh Bhoge
 * Builder pattern
 **/
public class BuilderPatterApp {
    public static void main(String[] args) {
        Phone phone =  new PhoneBuilder().setOs("Android")
                       .setManufacturer("Motorola").setBattery("3000").setRam(2).getPhone();
        System.out.println("Phone ::"+phone);
    }
}
