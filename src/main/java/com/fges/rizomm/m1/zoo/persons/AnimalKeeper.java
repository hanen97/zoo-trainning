package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;

public class AnimalKeeper extends Employee {
    public void feed(Animal animal, String food) {
        if (animal.getFamily().equals(this.getAnimalFamily())) {
            if (food != null && !food.equals("child")) {
                animal.eat(food);
            }

        }


    }
}
