package be.weloveanimals.animalFarm.barn;

import be.weloveanimals.animalFarm.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Barn {
    private int id;
    private String name;
    private Feeder feeder;
    private List<Animal> animals = new ArrayList<Animal>();

    public Barn() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Feeder getFeeder() {
        return feeder;
    }

    public void setFeeder(Feeder feeder) {
        this.feeder = feeder;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
