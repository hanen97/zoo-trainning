package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;

public class Vet<T extends Animal> extends Employee {

    public void checkAnimalFamily(T animal){
        if (animal.getFamily().equals(this.getAnimalFamily())) {
         cure(animal);
         checkHealth(animal);
        }

    }
    public void cure(T Animal) {
           if (Animal.isHealth()==false)//il est malade
                {
               System.out.println("je le soigne ");
           }
    }

    public void checkHealth(T Animal) {
        if(Animal.isHealth()==false){
            System.out.println("il est pas en bonne santé");

        } else {
            System.out.println("il est en bonne santé ");
        }
    }


}
