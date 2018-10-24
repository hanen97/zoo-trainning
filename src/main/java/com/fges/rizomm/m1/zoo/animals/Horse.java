package com.fges.rizomm.m1.zoo.animals;

public class Horse extends Animal {

    @Override
    public String toString() {
        return "Horse : " + super.toString();
    }

    @Override
    public String scream() {
        return "hihooon";
    }

}
