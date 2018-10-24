package com.fges.rizomm.m1.zoo.animals;

public abstract class Animal {
    private boolean health;
    private String name;
    private String family;

    private int eatCount;


    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    abstract String scream();

    public void eat(String food) {
        this.eatCount++;
    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }
}
