package com.fges.rizomm.m1.zoo.animals;

public class Fox extends Animal {

    @Override
    public String toString() {
        return "Fox : " + super.toString();
    }

    @Override
    public String scream() {
        return "wouuuuu";
    }

}
