package com.devices;

import com.dependencies.Harddisk;

public class Laptop {
    private Harddisk harddisk;

    public void setHarddisk(Harddisk harddisk) {
        this.harddisk = harddisk;
    }

    public void switchOn(){
        System.out.println("Laptop is switched on");
        harddisk.read();
        harddisk.write();
    }
}