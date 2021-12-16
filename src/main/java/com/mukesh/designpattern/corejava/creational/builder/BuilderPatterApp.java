package com.mukesh.designpattern.corejava.creational.builder;

/**
 * @author Mukesh Bhoge
 * Type : Core Java Creational Pattern
 * Builder pattern
 * Problem without Builder pattern : User have to follow sequesnce of input parameters while creating new object
 **/
public class BuilderPatterApp {
    public static void main(String[] args) {
        Phone phone =  new PhoneBuilder().setOs("Android")
                       .setManufacturer("Motorola").setBattery("3000").setRam(2).getPhone();
        System.out.println("Phone ::"+phone);
    }
}
