package com.spi;

public class DBSaver implements Save{
    @Override
    public void save(String message) {
        System.out.println("saveit in DB");
    }
}
