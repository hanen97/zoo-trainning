package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.components.Cage;
import com.fges.rizomm.m1.zoo.components.VisitingArea;

public class Cleaner extends Employee {

    public void cleanArea(VisitingArea v) {
        if (v.getNumberAnimal() != null || v.isCleanliness()==false) {
            System.out.println("i clean");

        } else {
            System.out.println("i don't clean ");
        }

    }

    public void cleanCage(Cage c) {
        if (c.getNumberAnimal() != null || c.isCleanliness() == false) {
            System.out.println("i clean");


        } else {
            System.out.println("i don't clean ");
        }

    }
}
