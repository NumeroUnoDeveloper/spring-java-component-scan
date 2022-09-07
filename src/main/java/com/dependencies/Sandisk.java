package com.dependencies;

public class Sandisk implements Harddisk{
    @Override
    public void read() {
        System.out.println("Reading from Sandisk");
    }

    @Override
    public void write() {
        System.out.println("Writing from Sandisk");
    }
}