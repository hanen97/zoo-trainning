package com.fges.rizomm.m1.zoo;

import com.fges.rizomm.m1.zoo.animals.*;
import com.fges.rizomm.m1.zoo.management.Management;
import com.fges.rizomm.m1.zoo.persons.AnimalKeeper;
import com.fges.rizomm.m1.zoo.persons.Person;
import com.fges.rizomm.m1.zoo.persons.Vet;

public class ZooApplication implements Management {

    private static final String ZOO_NAME = "PARIDAIZA";

    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("Welcome to " + ZOO_NAME);
        System.out.println("************************");

        Dog rex = new Dog();
        Dog gaia = new Dog();
        Cat felix = new Cat();
        Cock sardouk= new Cock();
        Crocodile lacoste = new Crocodile();
        Elephant babar = new Elephant();
        Fox coyote = new Fox();
        Horse blanca = new Horse();
        felix.setName("Felix");


        rex.setName("Rex");
        gaia.setName("Gaia");
        rex.setFamily(Animalfamily.MAMMALS.toString());
        felix.setFamily(Animalfamily.MAMMALS.toString());
        sardouk.setFamily(Animalfamily.BIRDS.toString());
        lacoste.setFamily(Animalfamily.REPTILE.toString());
        babar.setFamily(Animalfamily.MAMMALS.toString());
        coyote.setFamily(Animalfamily.MAMMALS.toString());
        blanca.setFamily(Animalfamily.MAMMALS.toString());

        Person toto = new Person();

        toto.addAnimal(gaia);
        toto.addAnimal(felix);

        System.out.println("Animals of toto");
        for (int i = 0; i < toto.getAnimals().size(); i++) {
            Animal animal = toto.getAnimals().get(i);
            switch (animal.getClass().getSimpleName()) {
                case "Dog":
                    System.out.println("Dog");
                    break;
                case "Cat":
                    System.out.println("Cat");
                    break;
            }

        }

        AnimalKeeper keeper = new AnimalKeeper();
        Animal dog = new Dog();

        System.out.println(dog.getEatCount());
        keeper.feed(dog, "steak");
        System.out.println(dog.getEatCount());
    }

    @Override
    public void affectToAnimalKeeper(Animal animal, AnimalKeeper animalKeeper) {

    }

    @Override
    public void affectToVet(Animal animal, Vet vet) {

    }
}
 enum Animalfamily {

    REPTILE , MAMMALS , BIRDS
}






