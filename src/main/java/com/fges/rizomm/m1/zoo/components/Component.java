package com.fges.rizomm.m1.zoo.components;

public abstract class Component {
    private String numberAnimal;
    private boolean cleanliness;

    public String getNumberAnimal() {
        return numberAnimal;
    }

    public void setNumberAnimal(String numberAnimal) {
        this.numberAnimal = numberAnimal;
    }

    public boolean isCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(boolean cleanliness) {
        this.cleanliness = cleanliness;
    }
}
