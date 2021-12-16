package com.mukesh.designpattern.corejava.creational.builder;

/**
 * @author Mukesh Bhoge
 **/
public class PhoneBuilder {
    private String os;
    private String manufacturer;
    private Integer ram;
    private Integer storage;
    private String battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public PhoneBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,manufacturer,ram,storage,battery);
    }
}
