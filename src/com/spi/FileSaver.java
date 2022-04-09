package com.spi;

public class FileSaver implements Save{
    @Override
    public void save(String message) {
        System.out.println("saveit in file");
    }
}
