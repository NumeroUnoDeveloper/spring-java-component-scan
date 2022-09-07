package com.config;

import com.dependencies.Harddisk;
import com.dependencies.Sandisk;
import com.dependencies.WesternDigital;
import com.devices.Computer;
import com.devices.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public Computer getComputer() {
        Harddisk harddiskA = new Sandisk();
        return new Computer(harddiskA);
    }

    @Bean
    public Laptop getLaptop() {
        Harddisk harddiskB = new WesternDigital();
        Laptop lp =  new Laptop();
        lp.setHarddisk(harddiskB);
        return lp;
    }
}
