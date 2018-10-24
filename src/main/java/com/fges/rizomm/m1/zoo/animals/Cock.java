package com.fges.rizomm.m1.zoo.animals;

public class Cock extends Animal {

    @Override
    public String toString() {
        return "Cock : " + super.toString();
    }

    @Override
    public String scream() {
        return "Coucoucou";
    }

}
