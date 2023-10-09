package com.example;

public class AnimalFactory {
    public static Animal create()
    {
       return new Dog();
    }
}
