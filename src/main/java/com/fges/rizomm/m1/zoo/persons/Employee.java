package com.fges.rizomm.m1.zoo.persons;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String animalFamily ;


    private List<String> materials = new ArrayList<>();

    private Double salary;

    private LocalTime startTime;
    private LocalTime endTime;

    private Employee manager;

    public String getAnimalFamily() {
        return animalFamily;
    }

    public void setAnimalFamily(String animalFamily) {
        this.animalFamily = animalFamily;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public void setMaterials(List<String> materials) {
        this.materials = materials;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
