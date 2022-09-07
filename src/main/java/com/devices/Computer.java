package com.devices;

import com.dependencies.Harddisk;

public class Computer {
    private Harddisk harddisk;

    public Computer(Harddisk harddisk) {
        this.harddisk = harddisk;
    }


    public void switchOn(){
        System.out.println("Computer is switched on");
        harddisk.read();
        harddisk.write();
    }

}