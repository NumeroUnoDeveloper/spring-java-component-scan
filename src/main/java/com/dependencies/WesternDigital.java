package com.dependencies;

public class WesternDigital implements Harddisk{
    @Override
    public void read() {
        System.out.println("Reading from WD");
    }

    @Override
    public void write() {
        System.out.println("Writing from WD");
    }
}