package com.batiaev.java3.lesson8;

public interface Test1 {
    default void exec() {
        System.out.println("test1");
    }
}
