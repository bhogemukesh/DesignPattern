package com.mukesh.designpattern.corejava.creational.builder;

/**
 * @author Mukesh Bhoge
 **/
public class Phone {
    private String os;
    private String manufacturer;
    private Integer ram;
    private Integer storage;
    private String battery;

    public Phone(String os, String manufacturer, Integer ram, Integer storage,String battery) {
        this.os = os;
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
