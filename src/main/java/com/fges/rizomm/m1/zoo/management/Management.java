package com.fges.rizomm.m1.zoo.management;


import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.persons.AnimalKeeper;
import com.fges.rizomm.m1.zoo.persons.Vet;

public interface Management{

    void affectToAnimalKeeper (Animal animal, AnimalKeeper animalKeeper);
    void affectToVet(Animal animal, Vet vet);

}