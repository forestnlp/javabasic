package com.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Save> load = ServiceLoader.load(Save.class);
        Iterator<Save> iterator = load.iterator();
        while (iterator.hasNext()){
            Save save = iterator.next();
            save.save("Hello");
        }
    }
}
